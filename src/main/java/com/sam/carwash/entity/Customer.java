package com.sam.carwash.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
@Table(name="CUSTOMER")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customersequence")
    @SequenceGenerator(name = "customersequence", allocationSize = 1)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "MOBILE_NUMBER", nullable = false)
    private String mobileNumber;    

    @Column(name = "ADDRESS", nullable = false)
    private String address;

    @Column(name = "CARID", nullable = false)
    private String carId;


    @ManyToOne(cascade =CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "CARID", referencedColumnName = "ID", insertable = false, updatable = false)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private CarDetails carDetails;

    @OneToMany(cascade =CascadeType.ALL)
    private List<Wash> washes;

    
}
