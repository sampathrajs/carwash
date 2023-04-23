package com.sam.carwash.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.carwash.entity.CustomerEntity;
import com.sam.carwash.repository.CustomerRepository;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public CustomerEntity save(CustomerEntity customerEntity){
        return customerRepository.save(customerEntity);
    }
    public List<CustomerEntity> getCustomers(){
        return customerRepository.findAll();
    }
    public Optional<CustomerEntity> getCustomer(int id){
        return customerRepository.findById(id);
    }

}
