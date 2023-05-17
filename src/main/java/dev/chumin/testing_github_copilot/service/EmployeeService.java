package dev.chumin.testing_github_copilot.service;

import dev.chumin.testing_github_copilot.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    List<Employee> employees = new ArrayList<>();

    public EmployeeService() {
        employees.add(new Employee("John", "Doe", 25, "123 Main St", "1234567890",
                "john.doe@gmail.com", "Software Engineer", "Engineering", "Google"));
    }
}