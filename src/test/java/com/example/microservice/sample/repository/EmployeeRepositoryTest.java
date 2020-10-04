package com.example.microservice.sample.repository;

import com.example.microservice.base.repository.BaseRepositoryTest;
import com.example.microservice.sample.entity.EmployeeEntity;
import org.junit.jupiter.api.*;

import java.util.List;

public class EmployeeRepositoryTest extends BaseRepositoryTest<EmployeeEntity> {


    @Override
    public List<EmployeeEntity> loadInitialEntitiesBeforeEachTest() {
        return EmployeeRepositoryObjectHelper.SAMPLE_DB_RECORDS;
    }

    @Test
    @DisplayName("It finds all records of db and compare them in size of initial values.")
    public void jpaSaveTest() {

        List<EmployeeEntity> allRecords = sut.findAll();
        Assertions.assertEquals(EmployeeRepositoryObjectHelper.SAMPLE_DB_RECORDS.size(), allRecords.size());
        Assertions.assertEquals(EmployeeRepositoryObjectHelper.SAMPLE_DB_RECORDS, allRecords);
    }

    @Disabled("Ignored because of a good reason")
    @Test
    public void malformedTest(){
        Assertions.assertTrue(false, "Always fails");
    }
}
