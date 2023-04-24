package com.sam.carwash.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.carwash.entity.CarDetails;
import com.sam.carwash.repository.CarRepository;

@Service
public class Carservice {
    @Autowired
    private CarRepository carRepository;
    
    public CarDetails saveCar(CarDetails car){
        return carRepository.save(car);
    }
    public List<CarDetails> getCars(){
        return carRepository.findAll();
    }
    public Optional<CarDetails> getCar(Long id){
        return carRepository.findById(id);
    }
    public String removeCar(Long id){
        carRepository.deleteById(id);
        return "car detail deleted successfully";
    }
}
