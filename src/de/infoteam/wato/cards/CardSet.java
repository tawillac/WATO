package de.infoteam.wato.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardSet {
	
	private List<Card> cardList;
	
	public CardSet() {
		this.cardList = new ArrayList<>();
	}
	
	public void addCard(Card card) {
		this.cardList.add(card);
	}
	
	public List<Card> getCardSet(){
		return cardList;
	}
	
	public void shuffle() {
		List<Card> newCardSet = new ArrayList<>(cardList);
		Collections.shuffle(newCardSet);
		this.cardList = newCardSet;
	}
	
	public void removeCard(Card card) {
	}
	
	public void draw() {
		
	}
	
	public void drop() {
		
	}
	
	public void handOut() {
		
	}
	
	

}
