package com.sam.carwash.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Wash {
    private int Id;
    private String Wash_Date;
    private Long Price;
    private int Car_Name;
    private int Employee_Name;
    private int customer_Name;
}
