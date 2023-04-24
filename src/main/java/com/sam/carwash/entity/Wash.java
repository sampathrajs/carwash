package com.sam.carwash.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="WASH")
public class Wash {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "washsequence")
    @SequenceGenerator(name = "washsequence", allocationSize = 1)
    @Column(name = "ID")
    private Long id;

    @Column(name = "WASH_DATE", nullable = false)
    private String washDate;

    @Column(name = "PRICE", nullable = false)
    private double price;

    @Column(name = "CAR_ID", nullable = false)
    private Long carId;

    @Column(name = "EMPLOYEE_ID", nullable = false)
    private Long employeeId;

    @Column(name = "CUSTOMER_ID", nullable = false)
    private Long customerId;

    @ManyToOne(cascade =CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "CAR_ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private CarDetails carDetails;

    @ManyToOne(cascade =CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Employee employee;

    @ManyToOne(cascade =CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Customer customer;

}
