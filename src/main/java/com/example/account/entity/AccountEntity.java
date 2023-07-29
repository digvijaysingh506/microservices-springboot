package com.example.account.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Accounts")
public class AccountEntity implements Serializable {

	private static final long serialVersionUID = -8273515493458390397L;

	@Column(name = "customer_id")
	private int customerId;

	@Id
	@Column(name = "account_number")
	private long accountNumber;

	@Column(name = "account_type")
	private String accountType;

	@Column(name = "branch_address")
	private String branchAddress;

	@Column(name = "create_dt")
	private LocalDate createDate;

}
