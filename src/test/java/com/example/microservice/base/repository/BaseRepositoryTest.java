package com.example.microservice.base.repository;

import com.example.microservice.base.BaseTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.annotation.Resource;


public abstract class BaseRepositoryTest<T> implements BaseTest<T> {


    @Resource
    public JpaRepository<T, Long> sut;

    @BeforeEach
    public final void beforeEachTest() {
        sut.saveAll(loadInitialEntitiesBeforeEachTest());
    }

    @AfterEach
    public final void afterEachTest() {
        sut.deleteAll();
    }
}
