import io.grpc.Server;
import io.grpc.ServerBuilder;
import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.agent.model.NewService;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.Executors;


public class SmartHomeServer {
    private Server lightServer;
    private Server tempServer;
    private Server securityServer;

    public void startServers() throws IOException {
        Properties properties = loadProperties();

        // Light Control Service
        int lightPort = Integer.parseInt(properties.getProperty("consul.service.port.light"));
        lightServer = ServerBuilder.forPort(lightPort)
                .addService(new LightControlServiceImpl())
                .build()
                .start();
        registerServiceWithConsul("LightControlService", lightPort);

        // Temperature Sensor Service
        int tempPort = Integer.parseInt(properties.getProperty("consul.service.port.temperature"));
        tempServer = ServerBuilder.forPort(tempPort)
                .addService(new TemperatureSensorServiceImpl())
                .build()
                .start();
        registerServiceWithConsul("TemperatureSensorService", tempPort);

        // Security System Service
        int securityPort = Integer.parseInt(properties.getProperty("consul.service.port.security"));
        securityServer = ServerBuilder.forPort(securityPort)
                .addService(new SecuritySystemServiceImpl())
                .build()
                .start();
        registerServiceWithConsul("SecuritySystemService", securityPort);

        // Await termination in the main thread
        Executors.newSingleThreadExecutor().submit(() -> {
            try {
                lightServer.awaitTermination();
                tempServer.awaitTermination();
                securityServer.awaitTermination();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

    private void registerServiceWithConsul(String serviceName, int port) {
        ConsulClient client = new ConsulClient("localhost");
        NewService newService = new NewService();
        newService.setId(serviceName + "-" + port);
        newService.setName(serviceName);
        newService.setPort(port);
        newService.setAddress("localhost");
        client.agentServiceRegister(newService);
    }

    private Properties loadProperties() {
        // Load properties from consul.properties
        Properties properties = new Properties();
        try {
            properties.load(this.getClass().getClassLoader().getResourceAsStream("consul.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    public static void main(String[] args) throws IOException {
        SmartHomeServer server = new SmartHomeServer();
        server.startServers();
    }
}