package com.example.microservice.sample.controller;

import com.example.microservice.sample.entity.EmployeeEntity;
import com.example.microservice.sample.exceptionsssss.model.Error;
import com.example.microservice.sample.exceptionsssss.model.ErrorResponse;
import com.example.microservice.sample.exceptionsssss.types.GlobalException;
import com.example.microservice.sample.exceptionsssss.types.unexpected.UnexpectedException;
import com.example.microservice.sample.repository.EmployeeRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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
//    @ExceptionHandler(UnexpectedException.class)
    String test() throws JsonProcessingException {
//        throw new GlobalException(new ErrorResponse(new Error(12, "type", "msg", Optional.of(""), "traceId")));
//        throw new RuntimeException("sdfdfsdf");
        throw new UnexpectedException("sdfdfsdf", Optional.of(""));
//        return new ObjectMapper().writeValueAsString(new EmployeeEntity("10L", "",5));
    }

    @ExceptionHandler(RuntimeException.class)
    public ModelAndView handleIOException(RuntimeException exception) {
        ModelAndView andView = new ModelAndView();
        andView.setViewName("error");
        return andView;
    }

}
