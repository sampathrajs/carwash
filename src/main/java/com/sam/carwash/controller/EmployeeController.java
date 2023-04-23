package com.sam.carwash.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import com.sam.carwash.entity.EmployeeEntity;
import com.sam.carwash.model.Employee;
import com.sam.carwash.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/list")
    public List<Employee> getEmployees(){
        return employeeService.getEmployees();
    }
    @PostMapping("/save")
    public EmployeeEntity saveEmployee(@RequestBody EmployeeEntity employee){
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/getEmployee/{id}")
    public Optional<EmployeeEntity> getEmployee(@PathVariable Integer id){
        return employeeService.getEmployee(id);
    }
    
}
