package com.tcs.inetrn21.ms.customermanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.inetrn21.ms.customermanagement.exception.UserNotFoundException;
import com.tcs.inetrn21.ms.customermanagement.model.Customer;
import com.tcs.inetrn21.ms.customermanagement.repository.CustomerJpaRepository;

@Service
public class CustomerService {
	
	private final CustomerJpaRepository customerRepo;
	
	@Autowired
	public CustomerService(CustomerJpaRepository customerRepo)
	{
		this.customerRepo=customerRepo;
	}
	
	
	public Customer addCustomer(Customer customer)
	{
		return customerRepo.save(customer);
	}
	
	public List<Customer> findAllCustomers()
	{
		return customerRepo.findAll();
	}
	
	public Customer updateCustomer(Customer customer)
	{
		return customerRepo.save(customer);
	}
	
	public Customer findCustomerById(Long id)
	{
		return customerRepo.findCustomerById(id).orElseThrow(() -> new UserNotFoundException("User By id"+id+"was not found"));
	}
	
	public void deleteCustomer(Long id)
	{
		customerRepo.deleteById(id);
	}


	


	
}
