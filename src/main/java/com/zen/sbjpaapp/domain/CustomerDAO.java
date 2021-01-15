package com.zen.sbjpaapp.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDAO extends CrudRepository<Customer, Integer>{
	
	public List<Customer> findAll();
	public Customer findById(int id);
	//implement List findByName and Customer findByEmail;
	public List<Customer> findByName(String name);
	public Customer findByEmail(String email);
	
	

}
