package com.EmpDatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.EmpDatabase.repository")
@SpringBootApplication
public class EmpDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpDatabaseApplication.class, args);
	}

}
