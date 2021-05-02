package com.ramproject.cardsprocessor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ramproject.cardsprocessor.entity.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, String>{

}
