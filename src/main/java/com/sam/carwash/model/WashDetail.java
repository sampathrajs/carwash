package com.sam.carwash.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WashDetail {
    private Long id;
    private String washdate;
    private double price;
    private String customername;
    private String employeename;
}
