package de.luv2code.springdemo.dao;

import java.util.List;

import de.luv2code.springdemo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();
}
