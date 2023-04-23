package com.sam.carwash.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sam.carwash.entity.WashEntity;
import com.sam.carwash.model.Wash;

@Repository
public interface WashRepository extends JpaRepository<WashEntity,Integer> {
    @Query(value = "select * from wash where customer_id=:id",nativeQuery = true)
    List<WashEntity> findByCustomerId(@Param("id") int id);
    @Query(value = "select * from wash where employee_id=:id",nativeQuery = true)
    List<WashEntity> findByEmployeeId(@Param("id") int id);
    @Query(value = "select wash.id,wash.wash_date,wash.price,customer.name as customer_name,employee.name as employee_name  from wash join customer on wash.customer_id=customer.id join employee on employee.id=wash.employee_id where wash.employee_id=:id",nativeQuery = true)
    List findDetails(@Param("id") int id);
 

    
}
