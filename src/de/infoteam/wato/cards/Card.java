package de.infoteam.wato.cards;

public class Card {
	
	private int value;
	private int suit;

	public Card(int value, int suit) {
		this.value =  value;
		this.suit = suit;
	}
	
	public String toString() {
		return value + "-" + suit;
	}
}
