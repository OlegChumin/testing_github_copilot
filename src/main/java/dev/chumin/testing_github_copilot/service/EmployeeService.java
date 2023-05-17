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

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public Employee getEmployeeByName(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                return employee;
            }
        }
        return null;
    }

    public Employee getEmployeeBySurname(String surname) {
        for (Employee employee : employees) {
            if (employee.getSurname().equals(surname)) {
                return employee;
            }
        }
        return null;
    }

    public Employee getEmployeeByAge(int age) {
        for (Employee employee : employees) {
            if (employee.getAge() == age) {
                return employee;
            }
        }
        return null;
    }

    public Employee getEmployeeByAddress(String address) {
        for (Employee employee : employees) {
            if (employee.getAddress().equals(address)) {
                return employee;
            }
        }
        return null;
    }

    public Employee getEmployee(int id) {
        return employees.get(id);
    }
}