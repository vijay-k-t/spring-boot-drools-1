package com.example.model;

import lombok.Getter;
import lombok.Setter;
 
@Getter
@Setter
public class Customer {

    private CustomerType type;

    private BusinessType businessType;

    private int years;

    private int discount;

    private String name;

    private String message;

    public Customer(CustomerType type, BusinessType businessType, int years) {
        this.type = type;
        this.years = years;
        this.businessType = businessType;
    }

    // Standard getters and setters
}
