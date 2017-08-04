package com.geniusmonkey.cards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Decks {

	private static final List<String> STANDARD_VALUE_ORDER = Arrays.asList("A", "2", "3", "4", "5", "7", "8", "9", "10", "J", "Q", "K");
	private static final List<Suit> STANDARD_SUIT_ORDER = Arrays.asList(Suit.HEART, Suit.SPADE, Suit.DIAMOND, Suit.CLUB);

	public static Deck standardDeck(){
		List<Card> cards = new ArrayList<>();
		for (String value : STANDARD_VALUE_ORDER) {
			for (Suit suit : STANDARD_SUIT_ORDER) {
				cards.add(new Card(suit, value));
			}
		}

		return new Deck(cards, new StandardDeckComparator());
	}

	private static class StandardDeckComparator implements Comparator<Card>{
		@Override
		public int compare(Card o1, Card o2) {
			int suiteOrder =  STANDARD_SUIT_ORDER.indexOf(o1.getSuit()) - STANDARD_SUIT_ORDER.indexOf(o2.getSuit());
			if (suiteOrder != 0) {
				return suiteOrder;
			}

			return STANDARD_VALUE_ORDER.indexOf(o1.getValue()) - STANDARD_VALUE_ORDER.indexOf(o2.getValue());
		}
	}
}
