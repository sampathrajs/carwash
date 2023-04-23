package com.sam.carwash.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    int id;
    String name;
    int departmentid;
    long mobilenumber;
    String address;
}
