package com.NguyenQuocHop.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.NguyenQuocHop.spingdemo.service.CustomerService;
import com.NguyenQuocHop.springdemo.dao.CustomerDAO;
import com.NguyenQuocHop.springdemo.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	// need to inject the customer DAO
	// not need this code because now we use inject CustomerService
	/*
	 * @Autowired private CustomerDAO customerDAO;
	 */
	
	// need to inject our customer service
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/list")	
	public String listCustomers(Model theModel) {
		
		// get customers from the service
		List<Customer> theCustomers = customerService.getCustomers();
		
		// add the customer to the model
		theModel.addAttribute("customers", theCustomers);
		
		return "list-customers";
	}
} 
