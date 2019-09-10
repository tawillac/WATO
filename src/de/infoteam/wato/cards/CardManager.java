package de.infoteam.wato.cards;

public class CardManager {

    public static void main(String[] args) {
        CardSet set = createDefaultCardSet(6, 4);
        set.getCardList().forEach(System.out::println);
        set.shuffle();
        System.out.println("============================");
        set.getCardList().forEach(System.out::println);

    }

    public static CardSet createDefaultCardSet(int numberOfValues, int numberOfSuits) {
        CardSet cardSet = new CardSet();
        for (int i = 0; i < numberOfValues; i++) {
            for (int j = 0; j < numberOfSuits; j++) {
                Card card = new Card(i, j);
                cardSet.addCard(card);
            }
        }
        return cardSet;
    }

    public void draw(CardSet fromSet, CardSet toSet, int anzahl) {
		for (int i = 0; i <anzahl ; i++) {
			move(fromSet, toSet);
		}
    }

    public void draw(CardSet fromSet, CardSet toSet) {
        draw(fromSet, toSet, 1);
    }

	public void move(CardSet fromSet, CardSet toSet) {
		move(fromSet, toSet, fromSet.getAndRemoveFirstCard());

    }

	public void move(CardSet fromSet, CardSet toSet, Card droppedCard) {
		fromSet.removeCard(droppedCard);
		toSet.addCard(droppedCard);
	}


}
