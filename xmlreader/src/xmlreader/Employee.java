package xmlreader;

//Employee.java
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "employee")
public class Employee {
 private String name;
 private String DOB;
 private String address;
 private int salary;

 @XmlElement(name = "Name")
 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 @XmlElement(name = "DOB")
 public String getDOB() {
     return DOB;
 }

 public void setDOB(String DOB) {
     this.DOB = DOB;
 }

 @XmlElement(name = "Address")
 public String getAddress() {
     return address;
 }

 public void setAddress(String address) {
     this.address = address;
 }

 @XmlElement(name = "Salary")
 public int getSalary() {
     return salary;
 }

 public void setSalary(int salary) {
     this.salary = salary;
 }
}
