package com.zen.sbjpaapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zen.sbjpaapp.domain.Customer;
import com.zen.sbjpaapp.domain.CustomerDAO;

@SpringBootApplication
public class SbjpaappApplication implements CommandLineRunner {
	@Autowired
	private CustomerDAO customerDAO;

	public static void main(String[] args) {
		SpringApplication.run(SbjpaappApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

//		findAll();
//		findbyId(7);
		findByName("John");
//		findByEmail("fred@gmail.com");
	}

	private void findbyId(int id) {
		Customer c = customerDAO.findById(id);
		System.out.println(c.getName() + " : " + c.getEmail());
	}

	private void findAll() {
		List<Customer> customers = customerDAO.findAll();
		for (Customer c : customers) {
			System.out.println(c.getName() + " : " + c.getEmail());
		}
	}
	
	private void findByName(String name) {
		List<Customer> customers = customerDAO.findByName(name);
		for(Customer c: customers) {
			System.out.println(c.getEmail());
		}
	}
	
	private void findByEmail(String email) {
		Customer c = customerDAO.findByEmail(email);
		System.out.println(c.getName());
	}

}
