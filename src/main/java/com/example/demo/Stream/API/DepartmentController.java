package com.example.demo.Stream.API;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class DepartmentController {

    private EmployeeService employeeService;

    public DepartmentController() {
        this.employeeService = new EmployeeService();
    }

    private boolean departmentExists(int departmentId) {
        // Проверка наличия отдела в базе данных или другом источнике данных
        return true; // Здесь должна быть реализация проверки
    }

    @GetMapping("/departments/max-salary")
    public Employee getEmployeeWithMaxSalaryByDepartment(@RequestParam("departmentId") int departmentId) {
        if (departmentExists(departmentId)) {
            return employeeService.getEmployeeWithMaxSalaryByDepartment(departmentId);
        }
        return null;
    }

    @GetMapping("/departments/min-salary")
    public Employee getEmployeeWithMinSalaryByDepartment(@RequestParam("departmentId") int departmentId) {
        if (departmentExists(departmentId)) {
            return employeeService.getEmployeeWithMinSalaryByDepartment(departmentId);
        }
        return null;
    }

    @GetMapping("/departments/{departmentId}/employees")
    public List<Employee> getAllEmployeesByDepartment(@PathVariable int departmentId) {
        if (departmentExists(departmentId)) {
            return employeeService.getAllEmployeesByDepartment(departmentId);
        }
        return null;
    }

    @GetMapping("/departments")
    public Map<Integer, List<Employee>> getAllEmployeesByDepartment() {
        return employeeService.getAllEmployeesByDepartment();
    }
}