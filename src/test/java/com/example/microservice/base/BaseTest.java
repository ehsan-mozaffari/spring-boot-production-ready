package com.example.microservice.base;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public interface BaseTest<T> {

    List<T> loadInitialEntitiesBeforeEachTest();
}
