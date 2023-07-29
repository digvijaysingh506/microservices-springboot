package com.example.loans.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.loans.entity.LoanEntity;
import com.example.loans.repository.LoanRepository;

@RestController
public class LoansController {

	@Autowired
	private LoanRepository loanRepository;

	@PostMapping("/loans-detail")
	private ResponseEntity<List<LoanEntity>> getLoansDeatil(@RequestBody LoanEntity entity) {
		return new ResponseEntity<>(loanRepository.findByCustomerIdOrderByStartDateDesc(1),
				HttpStatus.OK);
	}
}
