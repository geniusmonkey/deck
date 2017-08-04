package com.geniusmonkey.cards;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Deck {

	private final List<Card> cards;
	private final Comparator<Card> sortComparator;

	Deck(List<Card> cards, Comparator<Card> sortComparator) {
		this.cards = cards;
		this.sortComparator = sortComparator;
	}

	/**
	 * Lets you look a the next card without dealing it
	 */
	public Card peek() {
		if (hasCards()) {
			return cards.get(0);
		} else {
			return null;
		}
	}

	/**
	 * Deals a single card from the top
	 */
	public Card deal() {
		if (hasCards()) {
			return cards.remove(0);
		} else {
			return null;
		}
	}

	/**
	 * Deals on from the bottom of the deck*
	 */
	public Card cheat() {
		if (hasCards()) {
			return cards.remove(cards.size() - 1);
		} else {
			return null;
		}
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}

	public void sort() {
		cards.sort(sortComparator);
	}

	public boolean hasCards() {
		return cards.size() > 0;
	}

	/**
	 * Need to cut the deck of cards at this position. The cards below the
	 * position should be placed above the cards at that position
	 */
	public void cut(int position) {
		//TODO implement
	}
}
