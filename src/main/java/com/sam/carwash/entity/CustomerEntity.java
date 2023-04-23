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
@Table(name="CUSTOMER")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customersequence")
    @SequenceGenerator(name = "customersequence", allocationSize = 1)
    @Column(name="ID")
    private int id;
    @Column(name="NAME")
    private String name;
    @Column(name="MOBILE_NUMBER")
    private Long mobilenumber;
    @Column(name="CARID")
    private Long carid;
    @Column(name="ADDRESS")
    private String address;

    
}
