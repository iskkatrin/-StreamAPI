package com.example.demo.Stream.API;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class DepartmentController {
    private EmployeeService employeeService;

    public DepartmentController() {
        employeeService = new EmployeeService();
    }

    @GetMapping("/departments/max-salary")
    public ResponseEntity<Employee> getEmployeeWithMaxSalaryByDepartment(@RequestParam("departmentId") int departmentId) {
        Employee employee = employeeService.getEmployeeWithMaxSalaryByDepartment(departmentId);
        if (employee != null) {
            return ResponseEntity.ok().body(employee);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
