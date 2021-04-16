package com.tcs.inetrn21.ms.customermanagement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.inetrn21.ms.customermanagement.model.Transfer;

public interface TransferJpaRepository extends JpaRepository<Transfer,Long>{

	Optional<Transfer> findCustomerById(Long id);
	
}
