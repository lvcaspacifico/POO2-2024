package com.jlm.gradehoraria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class GradeHorariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradeHorariaApplication.class, args);
	}

}
