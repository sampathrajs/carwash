package com.sam.carwash.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sam.carwash.entity.Wash;
import com.sam.carwash.model.WashDetail;

@Repository
public interface WashRepository extends JpaRepository<Wash,Long> {
    @Query(value = "select * from wash where customer_id=:id",nativeQuery = true)
    List<Wash> findByCustomerId(@Param("id") Long id);
    @Query(value = "select * from wash where employee_id=:id",nativeQuery = true)
    List<Wash> findByEmployeeId(@Param("id") Long id);
    @Query(value = "select new com.sam.carwash.model.WashDetail(w.id as id,w.wash_date as washdate,w.price as price,c.name  as customername,e.name  as employeename) FROM wash w join customer c on w.customer_id=c.id join employee e on e.id=w.employee_id where w.employee_id=:id",nativeQuery = true)
    List<WashDetail> findDetailsexp(@Param("id") Long id);
    
}
