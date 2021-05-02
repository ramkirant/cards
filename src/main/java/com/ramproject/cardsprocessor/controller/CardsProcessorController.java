package com.ramproject.cardsprocessor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ramproject.cardsprocessor.entity.Card;

@RestController
public class CardsProcessorController {

	@GetMapping(path="/cards/{id}")
	public Card getCard(String id) {
		Card card = new Card();
		card.setId("1234");
		card.setQuestion("What is blue");
		card.setAnswer("Blue is a color");
		
		return card;
	}
}
