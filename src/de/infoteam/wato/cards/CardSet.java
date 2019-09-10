package de.infoteam.wato.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class CardSet {

    private List<Card> cardList;

    public CardSet() {
        this.cardList = new ArrayList<>();
    }

    public void addCard(Card card) {
        this.cardList.add(card);
    }

    public List<Card> getCardList() {
        return cardList;
    }

    public void shuffle() {
        List<Card> newCardSet = new ArrayList<>(cardList);
        Collections.shuffle(newCardSet);
        this.cardList = newCardSet;
    }

    public boolean removeCard(Card card) {
        return cardList.remove(card);
    }

    public Card getAndRemoveFirstCard() {
        Card card = cardList.get(0);
        cardList.remove(card);
        return card;

    }

}
