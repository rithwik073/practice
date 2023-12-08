package xmlreader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XmlFileReaderJAXB {
    public static void main(String[] args) {
        String xmlFilePath = "employee.xml";

        try {
            // Create a JAXBContext
            JAXBContext jaxbContext = JAXBContext.newInstance(Employees.class);

            // Create an Unmarshaller
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            // Read XML file and convert to Java object
            Employees employees = (Employees) unmarshaller.unmarshal(new File(xmlFilePath));

            // Print the content
            for (Employee employee : employees.getEmployeeList()) {
                System.out.println("Name: " + employee.getName());
                System.out.println("DOB: " + employee.getDOB());
                System.out.println("Address: " + employee.getAddress());
                System.out.println("Salary:s " + employee.getSalary());
                System.out.println();
            }
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}