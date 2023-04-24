package com.sam.carwash.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sam.carwash.entity.CarDetails;
import com.sam.carwash.service.Carservice;

@RestController
@RequestMapping("/api/car")
public class CarController {
    @Autowired
    private Carservice carservice;

    @PostMapping("/save")
    public CarDetails saveCar(@RequestBody CarDetails car){
        return carservice.saveCar(car);
    }
    @GetMapping("/list")
    public List<CarDetails> getCars(){
        return carservice.getCars();
    }
    @GetMapping("/getcar/{id}")
    public Optional<CarDetails> getCar(@PathVariable Long id){
        return carservice.getCar(id);
    }
    @DeleteMapping("/remove/{id}")
    public String removeCar(@PathVariable Long id){
        return carservice.removeCar(id);
    }

}
