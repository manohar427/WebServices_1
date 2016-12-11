package com.test;

import java.io.Serializable;

public class Customer implements Serializable {

	private static final long serialVersionUID = -1991221016497154195L;
	private String name;
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
