package chess.domain;

import java.util.Objects;

public class Position {
	private final int row;
	private final int column;
	private final String name;

	public Position(String name) {
		String[] split = name.split("");
		this.column = name.charAt(0) - 'a';
		this.row = Integer.parseInt(split[1]) - 1;
		this.name = name;
	}

	public Position(int row, int column) {
		this.row = row;
		this.column = column;
		this.name = String.valueOf((char)(column + 'a')) + (row + 1);
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Position position = (Position)o;
		return row == position.row &&
			column == position.column;
	}

	@Override
	public int hashCode() {
		return Objects.hash(row, column);
	}

	public boolean isSameRow(Position to) {
		return this.row == to.row;
	}

	public boolean isSameColumn(Position to) {
		return this.column == to.column;
	}

	@Override
	public String toString() {
		return "Position{" +
			"row=" + row +
			", column=" + column +
			", name='" + name + '\'' +
			'}';
	}
}
