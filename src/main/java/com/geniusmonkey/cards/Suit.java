package com.geniusmonkey.cards;

public enum Suit {
	HEART(Color.RED, "Hearts"),
	SPADE(Color.BLACK, "Spades"),
	DIAMOND(Color.RED, "Diamonds"),
	CLUB(Color.BLACK, "Clubs");

	private final Color color;
	private final String displayName;

	Suit(Color color, String displayName) {
		this.color = color;
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
	}

	public Color getColor() {
		return color;
	}
}
