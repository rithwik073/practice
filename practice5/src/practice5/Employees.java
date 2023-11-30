package practice5;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Employees {

    @JsonProperty("employees")
    private List<Employee> employeeList;

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    public Employees(){
}
}

