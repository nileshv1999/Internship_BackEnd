package com.tcs.inetrn21.ms.customermanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transfer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long source_accountId;
	private Long target_accountId;
	private Long amount;
	private String status;
	
	
	public Transfer() {
		
	}
	
	public Transfer(Long source_accountId, Long target_accountId, Long amount, String status) {
		super();
		this.source_accountId = source_accountId;
		this.target_accountId= target_accountId;
		this.amount = amount;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSource_account() {
		return source_accountId;
	}

	public void setSource_account(Long source_accountId) {
		this.source_accountId = source_accountId;
	}

	public Long getTarget_account() {
		return target_accountId;
	}

	public void setTarget_account(Long target_accountId) {
		this.target_accountId = target_accountId;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Transfer [id=" + id + ", source_account=" + source_accountId + ", target_account=" + target_accountId
				+ ", amount=" + amount + ", status=" + status + "]";
	}
	
	
	
	
	
	
	
	

}
