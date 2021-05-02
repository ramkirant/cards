package com.ramproject.cardsprocessor.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ramproject.cardsprocessor.entity.Card;
import com.ramproject.cardsprocessor.repository.CardRepository;

@RestController
public class CardsProcessorController {

	@Autowired
	CardRepository cardRepository;
	
	@GetMapping(path="/cards/{id}")
	public Card getCard(@PathVariable String id) {
		Optional<Card> card = cardRepository.findById(id);
		
		return card.get();
	}
	
	@PostMapping(path="/cards")
	public void addCard(@RequestBody Card card) {
		cardRepository.save(card);
	}
	
	@PutMapping(path="/cards")
	public void updateCard(@RequestBody Card card) {
		Card dbCard = cardRepository.findById(card.getId()).get();
		dbCard.setQuestion(card.getQuestion());
		dbCard.setAnswer(card.getAnswer());
		cardRepository.save(dbCard);
	}
	
	@DeleteMapping(path="/cards/{id}")
	public void deleteCard(String id) {
		
	}
}
