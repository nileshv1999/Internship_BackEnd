package com.tcs.inetrn21.ms.customermanagement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.tcs.inetrn21.ms.customermanagement.model.Customer;

@Component
public interface CustomerJpaRepository extends JpaRepository<Customer, Long>{

	void deleteById(Long id);

	Optional<Customer> findCustomerById(Long id);
	


}
