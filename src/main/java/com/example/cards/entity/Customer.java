package com.example.cards.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class Customer implements Serializable {

	private static final long serialVersionUID = -3147685522180536520L;

	private int customerId;
}
