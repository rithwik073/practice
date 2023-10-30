package sample;



import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

public class Thrid {
    public static void main(String[] args) {
        try {
            // Create a DocumentBuilder
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Parse the XML file
            Document document = builder.parse(new File("C:\\Users\\jagadees\\eclipse-workspace\\Employees\\src\\Employee.xml"));

            // Get a list of all "employee" elements
            NodeList employeeList = document.getElementsByTagName("employee");

            // Iterate through the employee elements and retrieve data
            for (int i = 0; i < employeeList.getLength(); i++) {
                Element employee = (Element) employeeList.item(i);
                String name = employee.getElementsByTagName("Name").item(0).getTextContent();
                String dob = employee.getElementsByTagName("DOB").item(0).getTextContent();
                String address = employee.getElementsByTagName("Address").item(0).getTextContent();
                String salary = employee.getElementsByTagName("Salary").item(0).getTextContent();

                // Print the employee information
                System.out.println("Employee " + (i + 1) + ": Name: " + name + " | DOB: " + dob + " | Address: " + address + " | Salary: " + salary);
                // Print a line to separate employee information
                System.out.println("--------------------------------------------------------------------------------------------------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

