package com.example;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.beans.Employee;

@SpringBootApplication
public class SpringbootEmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEmployeeApplication.class, args);
//		ConfigurableApplicationContext context=SpringApplication.run(SpringbootEmployeeApplication.class, args);
//		Employee e=context.getBean(Employee.class);
//		e.setName("abc");
//		System.out.println(e);
	}

}
