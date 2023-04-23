package com.sam.carwash.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sam.carwash.entity.WashEntity;
import com.sam.carwash.model.Wash;
import com.sam.carwash.service.WashService;

@RestController
@RequestMapping("/api/wash")
public class WashController {
    @Autowired
    private WashService washService;

    @PostMapping("/save")
    public WashEntity save(@RequestBody WashEntity washEntity){
return washService.save(washEntity);
    }
    @GetMapping()
    public List<WashEntity> list(){
        return washService.list();
    }
    @GetMapping("/{id}")
    public Optional<WashEntity> getbyid(int id){
        return washService.findwashById(id);
    }
    @GetMapping("/findbyCustomerId/{id}")
    public List<WashEntity> listByCustomerId(@PathVariable int id){
        return washService.listByCustomerId(id);
    }
    @GetMapping("/findbyEmployeeId/{id}")
    public List<WashEntity> listByEmployeeId(@PathVariable int id){
        return washService.listByEmployeeId(id);
    }
    @GetMapping("/findDetailsbyEmployeeId/{id}")
    public List DetailedWashList(@PathVariable int id){
        return washService.findDetailList(id);
    }
    
}
