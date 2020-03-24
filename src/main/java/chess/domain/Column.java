package chess.domain;

public enum Column {
	EIGHT("8"),
	SEVEN("7"),
	SIX("6"),
	FIVE("5"),
	FOUR("4"),
	THREE("3"),
	TWO("2"),
	ONE("1");

	private final String column;

	Column(String column) {
		this.column = column;
	}

	public String getColumn() {
		return column;
	}
}
