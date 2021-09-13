package com.example.SpringDataJPA.repository;

import com.example.SpringDataJPA.entity.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    @Modifying
    @Query("update Employee e set e.firstName = ?2 where e.EmployeeID = ?1")
    public void updateById(Long id, String newFirstName);

    @Modifying
    @Query("delete from Employee e where e.email = ?1")
    public void deleteByEmailCustom(String email);
    // List<Employee> findEmployeeByLastName(String lastName);
}
