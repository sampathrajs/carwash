package com.sam.carwash.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Employee")
public class EmployeeEntity {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employeesequence")
    @SequenceGenerator(name = "employeesequence", allocationSize = 1)
    @Column(name = "ID")
    private int id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "DEPARTMENT_ID")
    private String departmentid;
    @Column(name = "MOBILE_NUMBER")
    private long mobilenumber;
    @Column(name = "ADDRESS")
    private String address;

}
