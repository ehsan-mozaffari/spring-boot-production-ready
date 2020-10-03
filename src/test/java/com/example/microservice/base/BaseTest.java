package com.example.microservice.base;

import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public interface BaseTest<T> {

    List<T> loadInitialEntities();
}
