package com.sam.carwash.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sam.carwash.entity.CarEntity;
@Repository
public interface CarRepository extends JpaRepository<CarEntity,Integer>  {
    
}
