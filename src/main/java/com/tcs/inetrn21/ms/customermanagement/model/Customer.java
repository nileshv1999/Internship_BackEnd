package com.tcs.inetrn21.ms.customermanagement.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable=false, updatable=false)
	private Long id;
	private String name;
	private String password;
	private String contact_number;
	private String address;
	
	
	public Customer(Long id,String name, String password, String contact_number, String address) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.contact_number = contact_number;
		this.address = address;
	}
	
	
	public Customer() {
		
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContact_number() {
		return contact_number;
	}
	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", password=" + password + ", contact_number=" + contact_number
				+ ", address=" + address + "]";
	}
	
	
	
	
	
}
