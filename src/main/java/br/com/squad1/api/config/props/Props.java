package br.com.squad1.api.config.props;

import io.github.cdimascio.dotenv.Dotenv;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class Props extends Properties {
    public Props() {
        Dotenv dotenv = Dotenv.configure().load();

        String appDir = System.getProperty("user.dir");
        Path path = Paths.get(appDir, "src", "main", "resources");

        try {
            InputStream input = new FileInputStream(path + File.separator + "application.properties");
            load(input);

            setProperty("spring.datasource.url", dotenv.get("SPRING_DATASOURCE_URL"));
            setProperty("spring.datasource.username", dotenv.get("SPRING_DATASOURCE_USERNAME"));
            setProperty("spring.datasource.password", dotenv.get("SPRING_DATASOURCE_USERNAME"));
            setProperty("security.oauth2.client.client-id", dotenv.get("SECURITY_OAUTH2_CLIENT_CLIENT_ID"));
            setProperty("security.oauth2.client.client-secret", dotenv.get("SECURITY_OAUTH2_CLIENT_CLIENT_SECRET"));

            FileOutputStream output = new FileOutputStream(path + File.separator + "application.properties");
            store(output, null);
            output.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
