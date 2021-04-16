package com.tcs.inetrn21.ms.customermanagement;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.inetrn21.ms.customermanagement.model.Customer;
import com.tcs.inetrn21.ms.customermanagement.service.CustomerService;

@RestController

public class CustomerResource {
	private final CustomerService customerService;

	public CustomerResource(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	
	@GetMapping("/customer/all")
	public ResponseEntity<List<Customer>> getAllCustomer()
	{
		List<Customer> customers = customerService.findAllCustomers();
		return new ResponseEntity<>(customers, HttpStatus.OK);
	}
	
	
	
	
	
	@GetMapping("/customer/find/{id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable("id") Long id)
	{
		Customer customer = customerService.findCustomerById(id);
		return new ResponseEntity<>(customer, HttpStatus.OK);
	}
	
	@PostMapping("/customer/add")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer)
	{
		Customer newCustomer = customerService.addCustomer(customer);
		return new ResponseEntity<>(newCustomer, HttpStatus.CREATED);
	}
	
	@PutMapping("/customer/update")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer)
	{
		Customer updateCustomer = customerService.updateCustomer(customer);
		return new ResponseEntity<>(updateCustomer, HttpStatus.OK);
	}
	
	@DeleteMapping("/customer/delete/{id}")
	public ResponseEntity<?> deleteCustomer(@PathVariable("id") Long id)
	{
		customerService.deleteCustomer(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
