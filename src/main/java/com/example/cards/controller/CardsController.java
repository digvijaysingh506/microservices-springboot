package com.example.cards.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cards.entity.CardsEntity;
import com.example.cards.repository.CardsRepository;

@RestController
public class CardsController {

	@Autowired
	private CardsRepository cardsRepository;

	@PostMapping("/cards-detail")
	private ResponseEntity<List<CardsEntity>> findCardsDeatil(@RequestBody CardsEntity cardsEntity) {
		return new ResponseEntity<>(cardsRepository.findByCustomerId(1), HttpStatus.OK);
	}
}
