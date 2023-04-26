package com.sam.carwash.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.carwash.entity.Wash;
import com.sam.carwash.model.WashDetail;
import com.sam.carwash.repository.WashRepository;

@Service
public class WashService {
    @Autowired
    private WashRepository washRepository;

    public Wash save(Wash washEntity){
        return washRepository.save(washEntity);
    }
    public List<Wash> list(){
        return washRepository.findAll();
    }
    public Optional<Wash> findwashById(Long id){
        return washRepository.findById(id);
    }
    public List<Wash> listByCustomerId(Long id){
        return washRepository.findByCustomerId(id);
    }
    public List<Wash> listByEmployeeId(Long id){
        return washRepository.findByEmployeeId(id);
    }
    public List<WashDetail> findDetailList(Long id){
        return washRepository.findDetailsexp(id);
    }
    
    
}
