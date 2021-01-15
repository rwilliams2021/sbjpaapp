package com.zen.sbjpaapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.zen.sbjpaapp.domain.Customer;
import com.zen.sbjpaapp.domain.CustomerDAO;

@SpringBootApplication
public class SbjpaappApplication2 {
	

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SbjpaappApplication2.class, args);
		
		CustomerDAO customerDAO = context.getBean("customerDAO",CustomerDAO.class);
		List<Customer> customers = customerDAO.findAll();
		for (Customer c : customers) {
			System.out.println(c.getName() + " : " + c.getEmail());
		}
		
	}
	
		
	}


