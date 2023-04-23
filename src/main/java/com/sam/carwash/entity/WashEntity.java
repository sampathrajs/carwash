package com.sam.carwash.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="WASH")
public class WashEntity {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "washsequence")
    @SequenceGenerator(name = "washsequence", allocationSize = 1)
    @Column(name="ID")
    private int id;
    @Column(name="WASH_DATE")
    private String washDate;
    @Column(name="PRICE")
    private Long price;
    @Column(name="CAR_ID")
    private int carId;
    @Column(name="EMPLOYEE_ID")
    private int employeeId;
    @Column(name="CUSTOMER_ID")
    private int customerId;
}
