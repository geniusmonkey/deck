package com.geniusmonkey.cards;

import org.junit.Test;

public class DeckTest {

	@Test
	public void shouldDealFiveCardsToFourPlayers() throws Exception {
		int players = 4;
		int cards = 5;

		Deck deck = Decks.standardDeck();
		deck.shuffle();

		for (int i = 0; i < cards; i++) {
			for (int j = 0; j < players; j++) {
				System.out.println("Dealing to player " + j + " card: " + deck.deal());
			}
		}

		deck.sort();
		System.out.println("Sorted remaining cards");
		do {
			System.out.println("Remaining card: " + deck.deal());
		} while(deck.hasCards());
	}
}