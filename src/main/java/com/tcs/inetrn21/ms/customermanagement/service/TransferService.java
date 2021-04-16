package com.tcs.inetrn21.ms.customermanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.inetrn21.ms.customermanagement.exception.UserNotFoundException;

import com.tcs.inetrn21.ms.customermanagement.model.Transfer;
import com.tcs.inetrn21.ms.customermanagement.repository.CustomerJpaRepository;
import com.tcs.inetrn21.ms.customermanagement.repository.TransferJpaRepository;

@Service
public class TransferService {

	private final TransferJpaRepository transferRepository;
	
	@Autowired
	public TransferService(TransferJpaRepository transferRepository)
	{
		this.transferRepository=transferRepository;
	}
	
	public Transfer addTransfer(Transfer transfer)
	{
		/*Long from_Amt=Long.parseLong(transfer.getSource_account().getAvailable_balance());
		Long to_Amt = Long.parseLong(transfer.getTarget_account().getAvailable_balance());
		
		if(from_Amt>transfer.getAmount())
		{
			transfer.getSource_account().setAvailable_balance(Long.toString(from_Amt-transfer.getAmount()));
			transfer.getSource_account().setAvailable_balance(Long.toString(to_Amt+transfer.getAmount()));
		}*/
		return transferRepository.save(transfer);
	}
	
	public List<Transfer> findAllTransfers()
	{
		return transferRepository.findAll();
	}
	
	public Transfer findTransferById(Long id)
	{
		return transferRepository.findCustomerById(id).orElseThrow(() -> new UserNotFoundException("User By id"+id+"was not found"));
	}
	
	
	
	
}
