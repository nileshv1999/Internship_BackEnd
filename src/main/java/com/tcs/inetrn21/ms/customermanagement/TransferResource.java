package com.tcs.inetrn21.ms.customermanagement;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.inetrn21.ms.customermanagement.model.Account;
import com.tcs.inetrn21.ms.customermanagement.model.Customer;
import com.tcs.inetrn21.ms.customermanagement.model.Transfer;
import com.tcs.inetrn21.ms.customermanagement.service.TransferService;

@RestController
public class TransferResource {
	
	private TransferService transferService;
	
	public TransferResource(TransferService transferService)
	{
		this.transferService=transferService;
	}
	
	@GetMapping("transfer/all")
	public ResponseEntity<List<Transfer>> getAllTransfer()
	{
		List<Transfer> transfers = transferService.findAllTransfers();
		return new ResponseEntity<>(transfers, HttpStatus.OK);
	}
	
	
	@GetMapping("transfer/{id}")
	public ResponseEntity<Transfer> getTransferById(@PathVariable("id") Long id)
	{
		Transfer transfer = transferService.findTransferById(id);
		return new ResponseEntity<>(transfer, HttpStatus.OK);
	}
	
	
	
	
	@PostMapping("/transfer/add")
	public ResponseEntity<Transfer> addTransfer(@RequestBody Transfer transfer)
	{
		Transfer newTransfer = transferService.addTransfer(transfer);
		
		return new ResponseEntity<>(newTransfer, HttpStatus.CREATED);
	}


}
