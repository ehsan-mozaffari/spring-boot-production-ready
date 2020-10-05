package com.example.microservice.base.repository;

import com.example.microservice.base.BaseEntity;
import com.example.microservice.base.BaseTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.annotation.Resource;
import javax.persistence.Entity;
import java.util.List;


public abstract class BaseRepositoryTest<R extends JpaRepository> implements BaseTest {


    @Resource
    public R sut;

//    public abstract List<? extends BaseEntity> loadInitialEntitiesBeforeEachTest();


    @BeforeEach
    public final void beforeEachTest() {

//        sut.saveAll(loadInitialEntitiesBeforeEachTest());
    }

    @AfterEach
    public final void afterEachTest() {
        sut.deleteAll();
    }
}
