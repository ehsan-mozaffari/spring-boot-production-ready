package com.example.microservice.sample.controller;

import app.exception.types.unexpected.UnexpectedException;
import com.example.microservice.sample.entity.EmployeeEntity;
import com.example.microservice.sample.repository.EmployeeRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class SampleRestController {

    private final EmployeeRepository repository;

    SampleRestController(EmployeeRepository repository) {
        this.repository = repository;
    }

    // Aggregate root

    @GetMapping("/employees")
    List<EmployeeEntity> all() {
        return repository.findAll();
    }

    @GetMapping("/test")
    String test() throws JsonProcessingException {
        throw new UnexpectedException("sdfdfsdf", Optional.of(""));
//        return new ObjectMapper().writeValueAsString(new EmployeeEntity("10L", "",5));
    }

}
