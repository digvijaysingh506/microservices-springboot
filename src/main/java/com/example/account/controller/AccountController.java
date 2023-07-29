package com.example.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.account.entity.AccountEntity;
import com.example.account.repository.AccountRepository;

@RestController
public class AccountController {

	@Autowired
	private AccountRepository accountRepository;

	@PostMapping("/account-details")
	private ResponseEntity<AccountEntity> getAccountDetails(@RequestBody AccountEntity accountEntity) {
		return new ResponseEntity<>(accountRepository.findByCustomerId(1), HttpStatus.OK);
	}
}
