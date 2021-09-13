package com.example.SpringDataJPA;

import com.example.SpringDataJPA.entity.Employee;
import com.example.SpringDataJPA.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringDataJpaApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	public EmployeeRepository employeeRepository;

	@Test
	public void saveEmloyee(){
		Employee employee = Employee.builder()
				.firstName("Nguyen")
				.lastName("Vuong")
				.email("vv@gmail.com")
				.build();
		employeeRepository.save(employee);
	}
	@Test
	public void findAllEmployee(){
		List<Employee> employees = (List<Employee>) employeeRepository.findAll();
		System.out.println(employees);
	}
	@Test
	public void findById(){
		System.out.println(employeeRepository.findById(Long.valueOf(1)));
	}
	@Test
	public void updateById(){
		employeeRepository.updateById(Long.valueOf(1),
				"Vuong");
	}
	@Test
	public void deleteEmail(){
		employeeRepository.deleteByEmailCustom("vv@gmail.com");
	}

}
