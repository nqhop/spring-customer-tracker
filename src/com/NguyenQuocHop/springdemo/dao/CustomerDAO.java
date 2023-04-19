package com.NguyenQuocHop.springdemo.dao;

import java.util.List;

import com.NguyenQuocHop.springdemo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);
}
