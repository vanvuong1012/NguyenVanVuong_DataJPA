package com.example.SpringDataJPA.repository;

import com.example.SpringDataJPA.entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeeRepositoryTest {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Test
    	private void insertEmloyee(EmployeeRepository employeeRepository) {
            Employee employee = Employee.builder()
                    .firstName("Nguyen")
                    .lastName("Vuong")
                    .email("vanvuong@gmail.com")
                    .build();
            employeeRepository.save(employee);

        }
}