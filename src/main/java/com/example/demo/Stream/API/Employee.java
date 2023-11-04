package com.example.demo.Stream.API;

public class Employee {
    private String fullName;
    private int department;
    private double salary;
    private static int counter = 0;
    private int id;

    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;

    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    public void SetDepartment(int department) {
        this.department = department;
    }

    public void SetSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        final String s = "Employee " +
                "fullName='" + fullName + '\'' + ", " +
                "department=" + department +
                ", salary=" + salary +
                ", id=" + id;
        return s;
    }

    public static void getAllEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }
}