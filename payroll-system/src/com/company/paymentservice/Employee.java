package com.company.paymentservice;

public abstract class Employee {
    private int employeeId;
    private String name;
    private double salary;
    private int month;
    private int year;

    public Employee(int employeeId, String name, double salary, int month, int year) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.month = month;
        this.year = year;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public abstract String getRole();
}
