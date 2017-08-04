package com.geniusmonkey.cards;

public enum  Color {
	BLACK("Black"),
	RED("Red");

	private final String displayName;

	Color(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
	}
}
