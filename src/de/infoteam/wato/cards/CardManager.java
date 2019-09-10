package de.infoteam.wato.cards;

public class CardManager {
	
	public static void main(String[] args) {
		CardSet set = createDefaultCardSet(6, 4);
		set.getCardSet().forEach(System.out::println);
		set.shuffle();
		System.out.println("============================");
		set.getCardSet().forEach(System.out::println);
		
	}
	
	public static CardSet createDefaultCardSet(int numberOfValues, int numberOfSuits) {
		CardSet cardSet = new CardSet();	
		for (int i = 0; i < numberOfValues; i++) {
			for (int j = 0; j < numberOfSuits; j++) {
				Card card = new Card(i,j);
				cardSet.addCard(card);
			}
		}
		return cardSet;
	}

}
