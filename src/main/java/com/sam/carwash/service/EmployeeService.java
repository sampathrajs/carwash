package com.sam.carwash.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.carwash.entity.EmployeeEntity;
import com.sam.carwash.model.Employee;
import com.sam.carwash.repository.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private ModelMapper modelMapper;

    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<Employee>();
        List<EmployeeEntity> employeeEntities = employeeRepository.findAll();
        for (EmployeeEntity employeeEntity : employeeEntities) {
            Employee employee = modelMapper.map(employeeEntity, Employee.class);
            employees.add(employee);
        }
        return employees;
    }
    public EmployeeEntity saveEmployee(EmployeeEntity employee){
        return employeeRepository.save(employee);
    }
    public Optional<EmployeeEntity> getEmployee(Integer id){
        return employeeRepository.findById(id);
    }

}
