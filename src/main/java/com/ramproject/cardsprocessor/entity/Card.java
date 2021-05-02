package com.ramproject.cardsprocessor.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Card {
	private String id;
	private String question;
	private String answer;
}
