package com.example.microservice.sample.repository;

import com.example.microservice.base.repository.BaseRepositoryTest;
import com.example.microservice.sample.entity.EmployeeEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class EmployeeRepositoryTest extends BaseRepositoryTest<EmployeeEntity> {


    @Override
    public List<EmployeeEntity> loadInitialEntities() {
        return EmployeeRepositoryObjectHelper.SAMPLE_DB_RECORDS;
    }

    @Test
    public void testSave() {

        List<EmployeeEntity> allRecords = sut.findAll();
        Assertions.assertEquals(EmployeeRepositoryObjectHelper.SAMPLE_DB_RECORDS.size(), allRecords.size());
        Assertions.assertEquals(EmployeeRepositoryObjectHelper.SAMPLE_DB_RECORDS, allRecords);
    }
}
