package com.geniusmonkey.cards;

public class Card {
	private final Suit suit;
	private final String value;

	public Card(Suit suit, String value) {
		this.suit = suit;
		this.value = value;
	}

	public Suit getSuit() {
		return suit;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Card{");
		sb.append("suit=").append(suit);
		sb.append(", value='").append(value).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
