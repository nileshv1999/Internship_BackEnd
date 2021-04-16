package com.tcs.inetrn21.ms.customermanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.tcs.inetrn21.ms.customermanagement.exception.UserNotFoundException;
import com.tcs.inetrn21.ms.customermanagement.model.Account;
import com.tcs.inetrn21.ms.customermanagement.model.Customer;
import com.tcs.inetrn21.ms.customermanagement.repository.AccountJpaRepository;
import com.tcs.inetrn21.ms.customermanagement.repository.CustomerJpaRepository;

@Service
public class AccountService {
	
	private final AccountJpaRepository accountRepo;
	
	@Autowired
	public AccountService(AccountJpaRepository accountRepo)
	{
		this.accountRepo=accountRepo;
	}
	
	
	public Account addAccount(Account account)
	{
		return accountRepo.save(account);
	}
	
	public List<Account> findAllAccounts(Long customerId)
	{
		return accountRepo.findByCustomerId(customerId);
	}
	
	public Account updateAccount(Account account)
	{
		return accountRepo.save(account);
	}
	
	public Account findAccountById(Long id)
	{
		return accountRepo.findAccountById(id).orElseThrow(() -> new UserNotFoundException("Account By id"+id+"was not found"));
	}
	
	public void deleteAccount(Long id)
	{
		accountRepo.deleteById(id);
	}


	


	
}
