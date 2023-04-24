package com.sam.carwash.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.carwash.entity.Customer;
import com.sam.carwash.repository.CustomerRepository;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer save(Customer customerEntity){
        return customerRepository.save(customerEntity);
    }
    public List<Customer> getCustomers(){
        return customerRepository.findAll();
    }
    public Optional<Customer> getCustomer(Long id){
        return customerRepository.findById(id);
    }

}
