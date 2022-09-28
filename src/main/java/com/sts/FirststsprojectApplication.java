package com.sts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
@SpringBootApplication
public class FirststsprojectApplication {
	@Autowired
	College clg;
	public static void main(String[] args) {
		ApplicationContext obj = SpringApplication.run(FirststsprojectApplication.class, args);
		
		College clg = obj.getBean("clg",College.class);
		System.out.println(clg);
	}
	
	@Bean
	public College getCollege()
	{
		return new College("Global", "Jabalpur");
	}

}
