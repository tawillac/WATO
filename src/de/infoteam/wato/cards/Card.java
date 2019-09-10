package de.infoteam.wato.cards;

import java.util.Objects;

public class Card {
	
	private int value;
	private int suit;

	public Card(int value, int suit) {
		this.value =  value;
		this.suit = suit;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Card card = (Card) o;
		return value == card.value &&
				suit == card.suit;
	}

	@Override
	public int hashCode() {
		return Objects.hash(value, suit);
	}

	public String toString() {
		return value + "-" + suit;
	}
}
