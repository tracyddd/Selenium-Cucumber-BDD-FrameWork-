package utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private Properties properties;

    public ConfigReader() {
        String filePath = "src/test/resources/global.properties";  // 文件路径可以根据实际情况修改
        try (FileInputStream fis = new FileInputStream(filePath)) {
            properties = new Properties();
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load global.properties file.");
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
