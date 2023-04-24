package com.sam.carwash.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sam.carwash.entity.Wash;

@Repository
public interface WashRepository extends JpaRepository<Wash,Long> {
    @Query(value = "select * from wash where customer_id=:id",nativeQuery = true)
    List<Wash> findByCustomerId(@Param("id") Long id);
    @Query(value = "select * from wash where employee_id=:id",nativeQuery = true)
    List<Wash> findByEmployeeId(@Param("id") Long id);
    @Query(value = "select wash.id,wash.wash_date,wash.price,customer.name,employee.name FROM wash join customer on wash.customer_id=customer.id join employee on employee.id=wash.employee_id where wash.employee_id=:id",nativeQuery = true)
    String findDetails(@Param("id") Long id);
 

    
}
