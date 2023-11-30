package practice5;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;

public class JsonFileReader {
    public static void main(String[] args) {
        try {
            // Specify the path to your JSON file
            String jsonFilePath = "C:\\Users\\jagadees\\Desktop\\json file\\employee.json";

            // Create ObjectMapper
            ObjectMapper objectMapper = new ObjectMapper();

            // Read the JSON file into a JsonNode
            JsonNode jsonNode = objectMapper.readTree(new File(jsonFilePath));

            // Map JsonNode to Java classes
            Employees employees = objectMapper.treeToValue(jsonNode, Employees.class);

            // Access the list of employees
            List<Employee> employeeList = employees.getEmployeeList();

            // Iterate through each employee
            for (Employee employee : employeeList) {
                // Process the employee data as needed
                System.out.println("Name: " + employee.getName());
                System.out.println("DOB: " + employee.getDOB());
                System.out.println("Address: " + employee.getAddress());
                System.out.println("Salary: " + employee.getSalary());
                System.out.println("---------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

