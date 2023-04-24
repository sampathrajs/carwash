package com.sam.carwash.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "CAR_DETAILS")
public class CarDetails {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carsequence")
    @SequenceGenerator(name = "carsequence", allocationSize = 1)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "MODEL", nullable = false)
    private String model;

    @Column(name = "COLOR", nullable = false)
    private String color;

    @Column(name = "CAR_NUMBER", nullable = false)
    private String carNumber;

    @OneToMany(cascade =CascadeType.ALL)
    private List<Customer> customers;

    @OneToMany(cascade =CascadeType.ALL)
    private List<Wash> washes;
}
