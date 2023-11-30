package practice5;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {

    @JsonProperty("Name")
    private String name;

    @JsonProperty("DOB")
    private String DOB;

    @JsonProperty("Address")
    private String address;

    @JsonProperty("Salary")
    private int salary;

    // Getters and setters

    public String getName() {
        return name;
    }

    public String getDOB() {
        return DOB;
    }

    public String getAddress() {
        return address;
    }

    public int getSalary() {
        return salary;
    }
}

