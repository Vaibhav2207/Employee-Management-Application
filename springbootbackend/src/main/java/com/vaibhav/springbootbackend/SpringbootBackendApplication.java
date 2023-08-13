package com.vaibhav.springbootbackend;

import com.vaibhav.springbootbackend.model.Employee;
import com.vaibhav.springbootbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class SpringbootBackendApplication {

		public static void main(String[] args) {
			SpringApplication.run(SpringbootBackendApplication.class, args);
		}
	}