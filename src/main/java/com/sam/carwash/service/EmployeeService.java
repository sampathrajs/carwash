package com.sam.carwash.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.carwash.entity.Employee;
import com.sam.carwash.repository.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private ModelMapper modelMapper;

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }
    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
    public Optional<Employee> getEmployee(Long id){
        return employeeRepository.findById(id);
    }

}
