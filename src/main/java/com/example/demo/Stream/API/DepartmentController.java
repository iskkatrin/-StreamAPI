package com.example.demo.Stream.API;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

public class DepartmentController {

    private EmployeeService employeeService;

    // внедрение зависимости от EmployeeService через конструктор

    @GetMapping("/max-salary")
    public Employee getEmployeeWithMaxSalaryByDepartment(@RequestParam("departmentId") int departmentId) {
        return employeeService.getEmployeeWithMaxSalaryByDepartment(departmentId);
    }

    @GetMapping("/min-salary")
    public Employee getEmployeeWithMinSalaryByDepartment(@RequestParam("departmentId") int departmentId) {
        return employeeService.getEmployeeWithMinSalaryByDepartment(departmentId);
    }

    @GetMapping("/all")
    public List<Employee> getAllEmployeesByDepartment(@RequestParam("departmentId") int departmentId) {
        return employeeService.getAllEmployeesByDepartment(departmentId);
    }

    @GetMapping("/all")
    public Map<Integer, List<Employee>> getAllEmployeesByDepartment() {
        return employeeService.getAllEmployeesByDepartment();
    }
}