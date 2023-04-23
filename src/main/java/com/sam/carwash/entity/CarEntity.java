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

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CAR_DETAILS")
public class CarEntity {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carsequence")
    @SequenceGenerator(name = "carsequence", allocationSize = 1)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "MODEL")
    private String model;
    @Column(name = "COLOR")
    private String color;
    @Column(name = "CAR_NUMBER")
    private String carnumber;
}
