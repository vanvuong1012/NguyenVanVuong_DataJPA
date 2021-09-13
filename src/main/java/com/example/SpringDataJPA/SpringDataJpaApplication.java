package com.example.SpringDataJPA;

import com.example.SpringDataJPA.entity.Employee;
import com.example.SpringDataJPA.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaApplication {

//	@Autowired
//	private EmployeeRepository employeeRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner demo(EmployeeRepository employeeRepository){
//		return args -> {
//			insertEmloyee(employeeRepository);
//		};
//	}
//
//	private void insertEmloyee(EmployeeRepository employeeRepository){
//		Employee employee = Employee.builder()
//				.firstName("Van")
//				.lastName("Vuong")
//				.email("vanvuong@gmail.com")
//				.build();
//		employeeRepository.save(employee);
//
//
//	}

}
