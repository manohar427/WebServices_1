package com.test;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//http://crunchify.com/how-to-build-restful-service-with-java-using-jax-rs-and-jersey/
//http://www.java4s.com/web-services/jersey-hello-world-example-using-jax-rs-specification/
@Path("/customers")
public class HelloWorldService {

	@GET
	@Produces("text/html")
	public Response getLocalCust() {

		String output = "I am from 'getLocalCust' method";
		return Response.status(200).entity(output).build();
	}

	@GET
	@Path("/nri")
	@Produces("text/html")
	public Response getNriCust() {

		String output = "I am from 'getNriCust' method";
		return Response.status(200).entity(output).build();
	}

	@GET
	@Path("/json")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Customer> getJsonCust() {
		Customer c = new Customer();
		c.setAge("10");
		c.setName("Manohar");
		List<Customer> list = new ArrayList<Customer>();
		list.add(c);
		list.add(c);
		return list;
	}
	
	@GET
	@Path("/ijson")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public List<Customer> getJsonCustInfo(Customer c1) {
		Customer c = new Customer();
		c.setAge(c1.getAge());
		c.setName(c1.getName());
		List<Customer> list = new ArrayList<Customer>();
		list.add(c);
		list.add(c);
		return list;
	}
	
	@GET
	@Path("pparam/{id}/{name}")  
	@Produces(MediaType.APPLICATION_JSON)
	public List<Customer> getJsonCusts(@PathParam("id") String id,@PathParam("name") String name) {
		Customer c = new Customer();
		c.setAge(id);
		c.setName(name);
		List<Customer> list = new ArrayList<Customer>();
		list.add(c);
		list.add(c);
		return list;
	}
	
}