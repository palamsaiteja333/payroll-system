package com.company.paymentservice;

public class Manager extends Employee {
    private String department;

    public Manager(int employeeId, String name, double salary, int month, int year, String department) {
        super(employeeId, name, salary, month, year);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String getRole() {
        return "Manager";
    }
}
