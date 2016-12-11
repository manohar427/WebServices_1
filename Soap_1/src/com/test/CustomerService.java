package com.test;

public class CustomerService {

	public Customer getCustomer(Customer c) {

		c.setEmail("Abc@email.com");

		return c;
	}
}
