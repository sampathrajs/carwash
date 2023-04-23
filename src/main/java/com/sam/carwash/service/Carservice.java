package com.sam.carwash.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.carwash.entity.CarEntity;
import com.sam.carwash.repository.CarRepository;

@Service
public class Carservice {
    @Autowired
    private CarRepository carRepository;
    
    public CarEntity saveCar(CarEntity car){
        return carRepository.save(car);
    }
    public List<CarEntity> getCars(){
        return carRepository.findAll();
    }
    public Optional<CarEntity> getCar(Integer id){
        return carRepository.findById(id);
    }
    public String removeCar(Integer id){
        carRepository.deleteById(id);
        return "car detail deleted successfully";
    }
}
