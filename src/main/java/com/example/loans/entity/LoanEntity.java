package com.example.loans.entity;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "LOANS")
public class LoanEntity implements Serializable {

	private static final long serialVersionUID = -8433995024077619157L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "loan_number")
	private int loanNumber;

	@Column(name = "customer_id")
	private int customerId;

	@Column(name = "start_dt")
	private Date startDate;

	@Column(name = "loan_type")
	private String loanType;

	@Column(name = "total_loan")
	private int totalLoan;

	@Column(name = "amount_paid")
	private int amountPaid;

	@Column(name = "outstanding_amount")
	private int outstandingAmmount;

	@Column(name = "create_dt")
	private LocalDate createDate;
}
