package propertyFile;

import java.io.*;
import java.util.Properties;

public class ReadWritePropertiesFile {
    public static void main(String[] args) {
        // Define the file name
        String fileName = "config.properties";

        // Read and display properties
        readProperties(fileName);

        // Modify and write properties
        writeProperties(fileName);
    }

    private static void readProperties(String fileName) {
        Properties properties = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            properties.load(fileInputStream);
            System.out.println("Reading properties from " + fileName);
            properties.forEach((key, value) -> System.out.println(key + ": " + value));
        } catch (IOException e) {
            System.err.println("An error occurred while reading the properties file: " + e.getMessage());
        }
    }

    private static void writeProperties(String fileName) {
        Properties properties = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            properties.load(fileInputStream);
            // Modify or add new properties
            properties.setProperty("newKey", "NewValue");
        } catch (IOException e) {
            System.err.println("An error occurred while reading the properties file: " + e.getMessage());
        }

        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
            // Write the modified properties back to the file
            properties.store(fileOutputStream, "Updated properties");
            System.out.println("Updated properties written to " + fileName);
        } catch (IOException e) {
            System.err.println("An error occurred while writing the properties file: " + e.getMessage());
        }
    }
}

