package com.example.microservice.sample.repository;

import com.example.microservice.sample.entity.EmployeeEntity;

import java.util.Arrays;
import java.util.List;

public class EmployeeRepositoryObjectHelper {


    public static EmployeeEntity SAMPLE_EMPLOYEE_1 = new EmployeeEntity("Ali", "Developer", 25);
    public static EmployeeEntity SAMPLE_EMPLOYEE_2 = new EmployeeEntity("Amin", "Developer", 32);
    public static EmployeeEntity SAMPLE_EMPLOYEE_3 = new EmployeeEntity("Azita", "HR", 37);
    public static EmployeeEntity SAMPLE_EMPLOYEE_4 = new EmployeeEntity("Naser", "CTO", 35);
    public static EmployeeEntity SAMPLE_EMPLOYEE_5 = new EmployeeEntity("Alireza", "Developer", 19);

    public static List<EmployeeEntity> SAMPLE_DB_RECORDS = Arrays.asList(SAMPLE_EMPLOYEE_1, SAMPLE_EMPLOYEE_2, SAMPLE_EMPLOYEE_3, SAMPLE_EMPLOYEE_4, SAMPLE_EMPLOYEE_5);

}
