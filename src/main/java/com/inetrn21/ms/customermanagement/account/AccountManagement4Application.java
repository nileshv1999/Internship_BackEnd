package com.inetrn21.ms.customermanagement.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.tcs.inetrn21.ms.customermanagement.CustomerManagement1CloneApplication;

@SpringBootApplication
@ComponentScan(basePackages={"com.inetrn21.ms.customermanagement"})
public class AccountManagement4Application {

	public static void main(String[] args) {
		SpringApplication.run(CustomerManagement1CloneApplication.class, args);
	}

}
