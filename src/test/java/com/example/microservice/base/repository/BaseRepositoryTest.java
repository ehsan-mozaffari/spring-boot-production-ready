package com.example.microservice.base.repository;

import com.example.microservice.base.BaseTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.annotation.Resource;
import java.util.List;


public abstract class BaseRepositoryTest<T> implements BaseTest {


    List<T> initialEntities = getInitialEntities();

    public abstract List<T> getInitialEntities();

    @Resource
    public JpaRepository<T, Long> sut;

    @BeforeEach
    public final void beforeEachTest() {
        this.initialEntities = getInitialEntities();
        sut.saveAll(initialEntities);
    }

    @AfterEach
    public final void afterEachTest() {
        sut.deleteAll();
    }
}
