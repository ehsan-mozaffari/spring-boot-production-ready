package com.example.microservice.sample.repository;

import com.example.microservice.sample.entity.EmployeeEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Optional;

@SpringBootTest
public class EmployeeRepositoryTest {

    @Resource
    private EmployeeRepository repo;

    @Test
    public void testSave() {
        EmployeeEntity emp = new EmployeeEntity("Ehsan", "developer");
        repo.save(emp);

        Optional<EmployeeEntity> dbEmp = repo.findById(1L);
        Assertions.assertEquals("Ehsan", dbEmp.get().getName());
    }
}
