package de.infoteam.wato.cards;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CardSetTest {

    private static CardSet cardSet;
    private static List<Card> list;

    @BeforeAll
    static void init() {
        cardSet = CardManager.createDefaultCardSet(6, 4);
        list = cardSet.getCardList();
    }

    @Test
    void addCard() {
        int oldSize = list.size();
        Card card = new Card(7, 1);
        list.add(card);
        assertEquals(oldSize + 1, list.size());
        assertTrue(list.contains(card));
    }

    @Test
    void shuffle() {
        cardSet.shuffle();
        List<Card> cardListAfterShuffle = cardSet.getCardList();
        assertNotEquals(list, cardListAfterShuffle);
    }

    @Test
    void removeCard() {
        Card card = new Card(2, 3);
        int size = list.size();
        cardSet.removeCard(card);
        list = cardSet.getCardList();
        assertEquals(size - 1, list.size());
        assertFalse(list.contains(card));
    }

    @Test
    void getAndRemoveFirstCard() {
        int size = list.size();
        Card firstCard = list.get(0);
        Card theSameCard = cardSet.getAndRemoveFirstCard();
        assertEquals(firstCard, theSameCard);
        assertEquals(size - 1, list.size());
    }
}
