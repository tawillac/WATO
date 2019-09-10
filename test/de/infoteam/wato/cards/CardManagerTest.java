package de.infoteam.wato.cards;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class CardManagerTest {

    private CardSet cardSet;
    private List<Card> list;

    @BeforeEach
    void init(){
        cardSet = CardManager.createDefaultCardSet(6, 4);
        list = cardSet.getCardList();
    }

    @Test
    void createDefaultCardSet() {
        assertNotNull(cardSet);
        assertEquals(24, cardSet.getCardList().size());
    }

    @Test
    void draw() {
        int anzahl = 2;
        int size = list.size();
        CardSet toSet = new CardSet();
        for (int i = 0; i <anzahl ; i++) {
            toSet.addCard(cardSet.getAndRemoveFirstCard());
        }
        assertEquals(size - anzahl, list.size());
        assertEquals(toSet.getCardList().size(), anzahl);
    }

    @Test
    void drop() {
    }
}
