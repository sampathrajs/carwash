package com.sam.carwash.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.carwash.entity.WashEntity;
import com.sam.carwash.model.Wash;
import com.sam.carwash.repository.WashRepository;

@Service
public class WashService {
    @Autowired
    private WashRepository washRepository;

    public WashEntity save(WashEntity washEntity){
        return washRepository.save(washEntity);
    }
    public List<WashEntity> list(){
        return washRepository.findAll();
    }
    public Optional<WashEntity> findwashById(int id){
        return washRepository.findById(id);
    }
    public List<WashEntity> listByCustomerId(int id){
        return washRepository.findByCustomerId(id);
    }
    public List<WashEntity> listByEmployeeId(int id){
        return washRepository.findByEmployeeId(id);
    }
    public List findDetailList(int id){
        return washRepository.findDetails(id);
    }
    
    
}
