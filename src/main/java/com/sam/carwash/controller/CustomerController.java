package com.sam.carwash.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sam.carwash.entity.Customer;
import com.sam.carwash.service.CustomerService;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/save")
    public Customer saveCustomer(@RequestBody Customer customerEntity){
        System.out.println(customerEntity);
        return customerService.save(customerEntity);
    }

    @GetMapping()
    public List<Customer> getCustomers(){
        return customerService.getCustomers();
    }
    @GetMapping("/{id}")
    public Optional<Customer> getCustomer(@PathVariable Long id){
        return customerService.getCustomer(id);
    }
    
    
}
