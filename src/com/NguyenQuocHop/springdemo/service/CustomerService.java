package com.NguyenQuocHop.springdemo.service;

import java.util.List;

import com.NguyenQuocHop.springdemo.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
}
