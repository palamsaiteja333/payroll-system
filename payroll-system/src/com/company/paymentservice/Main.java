package com.company.paymentservice;

public class Main {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();

        Employee employee1 = new Employee(1, "John Doe", 2500, 6, 2023) {
            @Override
            public String getRole() {
                return "Employee";
            }
        };

        Employee employee2 = new Employee(2, "Jane Smith", 3000, 6, 2023) {
            @Override
            public String getRole() {
                return "Employee";
            }
        };

        Manager manager1 = new Manager(3, "David Johnson", 5000, 6, 2023, "Sales");

        payrollSystem.addEmployee(employee1);
        payrollSystem.addEmployee(employee2);
        payrollSystem.addEmployee(manager1);

        payrollSystem.displayPayroll();

        double totalPayroll = payrollSystem.calculateTotalPayroll();
        System.out.println("Total Payroll: $" + totalPayroll);
    }
}
