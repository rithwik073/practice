package jackson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class Read {
    public static void main(String[] args) {
        String xmlFilePath = "C:\\Users\\jagadees\\eclipse-workspace\\Employees\\src\\Employee.xml";

        try {
            // Create an XmlMapper
            XmlMapper xmlMapper = new XmlMapper();

            // Read XML file and convert to JsonNode
            JsonNode jsonNode = xmlMapper.readTree(new File(xmlFilePath));

            // Convert JsonNode to JSON String (pretty printed)
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonString = objectMapper.writeValueAsString(jsonNode);

            // Print JSON String
            System.out.println(jsonString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
