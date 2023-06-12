package com.company.paymentservice;

import java.util.ArrayList;
import java.util.List;

public class PayrollSystem {
    private List<Employee> employees;

    public PayrollSystem() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayPayroll() {
        System.out.println("Payroll Information:");
        employees.forEach(employee -> System.out.println("Employee ID: " + employee.getEmployeeId() +
                ", Name: " + employee.getName() +
                ", Role: " + employee.getRole() +
                ", Salary: $" + employee.getSalary() +
                ", Month: " + employee.getMonth() +
                ", Year: " + employee.getYear()));
    }

    public double calculateTotalPayroll() {
        return employees.stream()
                .mapToDouble(Employee::getSalary)
                .sum();
    }
}
