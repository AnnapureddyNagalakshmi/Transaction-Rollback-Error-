package com.DbJpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.DbJpa.service.EmployeeService;

@SpringBootApplication
public class TransactionRollbackApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(TransactionRollbackApplication.class, args);
		EmployeeService service=context.getBean(EmployeeService.class);
		service.saveDate();
	}

}
