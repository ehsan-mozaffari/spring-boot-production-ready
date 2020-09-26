package com.example.microservice.sample.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class EmployeeEntity {

    private @Id @GeneratedValue Long id;
    private String name;
    private String role;

    public EmployeeEntity() {}

    public EmployeeEntity(String name, String role) {

        this.name = name;
        this.role = role;
    }
}
