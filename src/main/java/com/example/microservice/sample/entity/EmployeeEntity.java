package com.example.microservice.sample.entity;


import com.example.microservice.base.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class EmployeeEntity extends BaseEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String role;
    private Integer age;

    public EmployeeEntity() {
    }

    public EmployeeEntity(String name, String role, Integer age) {

        this.name = name;
        this.role = role;
        this.age = age;
    }
}
