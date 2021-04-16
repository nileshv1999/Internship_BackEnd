package com.tcs.inetrn21.ms.customermanagement.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.tcs.inetrn21.ms.customermanagement.model.Account;
import com.tcs.inetrn21.ms.customermanagement.model.Customer;

@Component
public interface AccountJpaRepository extends JpaRepository<Account, Long>{

	void deleteById(Long id);

	Optional<Account> findAccountById(Long id);
	
	public List<Account> findByCustomerId(Long customerId);
	


}
