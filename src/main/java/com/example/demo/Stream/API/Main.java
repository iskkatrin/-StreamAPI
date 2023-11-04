package com.example.demo.Stream.API;

public class Main {
    private static Employee[] employees;

    public static void main(String[] args) {
        Employee employee1 = new Employee("Inna Breduk", 1, 1000);
        Employee employee2 = new Employee("Katy Larina", 2, 2000);
        Employee employee3 = new Employee("Mary Rodionova", 3, 3000);
        Employee employee4 = new Employee("Vita Kosenko", 4, 4000);
        Employee employee5 = new Employee("Luba Kievec", 5, 5000);

        System.out.println(employee1.getId());
        System.out.println(employee2.getId());
        System.out.println(employee3.getId());
        System.out.println(employee4.getId());
        System.out.println(employee5.getId());

        System.out.println(employee1.getFullName());
        System.out.println(employee2.getFullName());
        System.out.println(employee3.getFullName());
        System.out.println(employee4.getFullName());
        System.out.println(employee5.getFullName());

        System.out.println(employee1.getDepartment());
        System.out.println(employee2.getDepartment());
        System.out.println(employee3.getDepartment());
        System.out.println(employee4.getDepartment());
        System.out.println(employee5.getDepartment());

        System.out.println(employee1.getSalary());
        System.out.println(employee2.getSalary());
        System.out.println(employee3.getSalary());
        System.out.println(employee4.getSalary());
        System.out.println(employee5.getSalary());

        employees = new Employee[10];

        employees[0] = new Employee("Inna Breduk", 1, 1000);
        employees[1] = new Employee("Katy Larina", 2, 2000);
        employees[2] = new Employee("Mary Rodionova", 3, 3000);
        employees[3] = new Employee("Vita Kosenko", 4, 4000);
        employees[4] = new Employee("Luba Kievec", 5, 5000);


        Employee.getAllEmployees(employees);

        double totalSalaryExpense = calculateMonthlySalaryExpense(employees);

        System.out.println("Сумма затрат на зарплаты в месяц: " + totalSalaryExpense);

        findEmployeeWithMinSalary();

        findEmployeeWithMaxSalary();

        double averageSalary = calculateAverageSalary();
        System.out.println("Средняя зарплата: " + averageSalary);

        printEmployeesFullNames(employees);

    }

    public static double calculateMonthlySalaryExpense(Employee[] employees) {
        double totalSalaryExpense = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalaryExpense += employee.getSalary();
            }
        }
        return totalSalaryExpense;

    }


    public static void findEmployeeWithMinSalary() {
        Employee minSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employee;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой " + minSalaryEmployee.toString());
    }

    public static void findEmployeeWithMaxSalary() {
        double minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > minSalary) {
                minSalary = employee.getSalary();
            }
        }
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() == minSalary) {
                System.out.println("Сотрудник с максимальной зарплатой " + employee.toString());
            }
        }
    }


    public static double calculateAverageSalary() {
        double totalSalaryExpense = calculateMonthlySalaryExpense(employees);
        int numEmployees = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                numEmployees++;
            }
        }
        double averageSalary = totalSalaryExpense / numEmployees;
        return averageSalary;
    }

    public static void printEmployeesFullNames(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
}
