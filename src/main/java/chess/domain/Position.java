package chess.domain;

public class Position {
	private final int row;
	private final int column;
	private final String name;

	public Position(String name) {
		this.row = name.charAt(0) - 32;
		this.column = name.charAt(1) % 8;
		this.name = name;
	}

	public Position(int row, int column) {
		this.row = row;
		this.column = column;
		this.name = String.valueOf(row) + column;
	}
}
