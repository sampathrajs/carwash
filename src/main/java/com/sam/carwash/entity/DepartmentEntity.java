package com.sam.carwash.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "departments")
public class DepartmentEntity {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "departmentsequence")
    @SequenceGenerator(name = "departmentsequence", allocationSize = 1)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    
}
