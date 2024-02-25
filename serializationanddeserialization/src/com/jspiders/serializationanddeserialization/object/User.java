package com.jspiders.serializationanddeserialization.object;

import java.io.Serializable;
import java.rmi.Remote;

public class User implements Serializable { //Object of user class is to be created

	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String email;
	private long mobile;
	
	public User(int id, String name, String email, long mobile) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + "]";
	}
		
	
}
