package com.test;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/customerinfo")
public class MyServices {

	@GET
	@Produces("text/html")
	@Path("/custinfo")
	public Response getCustomerInfo() {
		// business
		return Response.ok("<B> Here is your Customer Information</B>").build();
	}

	@POST
	@Produces("text/html")
	@Path("/accinfo")
	public Response getAccInfo() {
		// business
		return Response.ok("<B> Here is your Acc Information</B>").build();
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/custList")
	public List<Customer> getCustomerList() {

		List<Customer> list = new ArrayList<Customer>();

		Customer c1 = new Customer();
		c1.setAge(10);
		c1.setEmail("abc@email.com");
		c1.setName("Abc");

		Customer c2 = new Customer();
		c2.setAge(11);
		c2.setEmail("pqr@email.com");
		c2.setName("Pqr");

		list.add(c1);
		list.add(c2);
		return list;
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/stdList")
	public List<Customer> getStudentInfo(Customer c) {

		List<Customer> list = new ArrayList<Customer>();

		Customer c1 = new Customer();
		c1.setAge(10);
		c1.setEmail("abc@email.com");
		c1.setName("Abc");

		Customer c2 = new Customer();
		c2.setAge(11);
		c2.setEmail("pqr@email.com");
		c2.setName("Pqr");
		if (c.getAge().intValue() == 10) {
			list.add(c1);
		} else {
			list.add(c2);
		}
		return list;
	}

}
