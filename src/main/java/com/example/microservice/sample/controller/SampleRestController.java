package com.example.microservice.sample.controller;

import com.example.microservice.sample.entity.EmployeeEntity;
import com.example.microservice.sample.exception.core.EntityNotFoundException;
import com.example.microservice.sample.exception.core.TestException;
import com.example.microservice.sample.repository.EmployeeRepository;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class SampleRestController {

    private final EmployeeRepository repository;

    SampleRestController(EmployeeRepository repository) {
        this.repository = repository;
    }

    // Aggregate root

    @GetMapping("/employees")
    List<EmployeeEntity> all() {
        throw new TestException();
//        return repository.findAll();
    }

}
