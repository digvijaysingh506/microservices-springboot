package com.example.loans.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class Customer implements Serializable {

	private static final long serialVersionUID = -848208751963331428L;

	private int customerId;

}
