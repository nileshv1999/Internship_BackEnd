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

import com.tcs.inetrn21.ms.customermanagement.model.Account;
import com.tcs.inetrn21.ms.customermanagement.model.Customer;
import com.tcs.inetrn21.ms.customermanagement.service.AccountService;
import com.tcs.inetrn21.ms.customermanagement.service.CustomerService;

@RestController
public class AccountResource {
	private final AccountService accountService;

	public AccountResource(AccountService accountService) {
		this.accountService = accountService;
	}
	
	
	@GetMapping("/customer/{id}/account")
	public ResponseEntity<List<Account>> getAllAccount(@PathVariable Long id)
	{
		List<Account> accounts = accountService.findAllAccounts(id);
		return new ResponseEntity<>(accounts, HttpStatus.OK);
	}
	
	
	
	@GetMapping("/customer/{customerId}/account/{id}")
	public ResponseEntity<Account> getAccountById(@PathVariable("id") Long id)
	{
		Account account = accountService.findAccountById(id);
		return new ResponseEntity<>(account, HttpStatus.OK);
	}
	
	
	@PostMapping("/customer/{customerId}/account")
	public ResponseEntity<Account> addAccount(@RequestBody Account account, @PathVariable Long customerId)
	{
		account.setCustomer(new Customer(customerId,"","","",""));
		Account newAccount = accountService.addAccount(account);
		return new ResponseEntity<>(newAccount, HttpStatus.CREATED);
	}
	
	@PutMapping("/customer/{customerId}/account/{id}")
	public ResponseEntity<Account> updateAccount(@RequestBody Account account,@PathVariable Long id,@PathVariable Long customerId)
	{
		account.setCustomer(new Customer(customerId,"","","",""));
		Account updateAccount = accountService.updateAccount(account);
		return new ResponseEntity<>(updateAccount, HttpStatus.OK);
	}
	
	@DeleteMapping("/customer/{customerId}/account/{id}")
	public ResponseEntity<?> deleteCustomer(@PathVariable("id") Long id)
	{
		accountService.deleteAccount(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
