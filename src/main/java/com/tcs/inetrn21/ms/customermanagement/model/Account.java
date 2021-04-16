package com.tcs.inetrn21.ms.customermanagement.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.tcs.inetrn21.ms.customermanagement.model.Customer;

@Entity
public class Account implements Serializable{
	
	
	@Id
	
	@Column(nullable=false, updatable=false)
	private Long id;
	private String name;
	private String currency;
	private String available_balance;
	
	@ManyToOne
	private Customer customer;
	
	public Account() {
		
	}


	public Account(Long id, String name, String currency, String available_balance, Long customerId) {
		super();
		this.id = id;
		this.name = name;
		this.currency = currency;
		this.available_balance = available_balance;
		this.customer = new Customer(customerId,"","","","");
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
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getAvailable_balance() {
		return available_balance;
	}
	public void setAvailable_balance(String available_balance) {
		this.available_balance = available_balance;
	}
	
	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", currency=" + currency + ", available_balance="
				+ available_balance + "]";
	}
	
	
	
	
	
}
