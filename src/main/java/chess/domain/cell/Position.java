package chess.domain.cell;

import java.util.Objects;

public class Position {
	private final Row row;
	private final Column column;
	private final String name;

	public Position(Row row, Column column) {
		this.row = row;
		this.column = column;
		this.name = row.getName() + column.getName();
	}

	public Position(int rowValue, int columnValue) {
		this.row = Row.from(rowValue);
		this.column = Column.from(columnValue);
		this.name = row.getName() + column.getName();
	}

	public Position(String name) {
		String[] input = name.split("");
		this.row = Row.fromName(input[0]);
		this.column = Column.fromName(input[1]);
		this.name = row.getName() + column.getName();
	}

	public Position minus(Position other) {
		return new Position(other.row.minus(this.row), other.column.minus(this.column));
	}

	public Position plus(Position other) {
		return new Position(row.plus(other.row), column.plus(other.column));
	}

	public boolean isSameRow(Position to) {
		return this.row == to.row;
	}

	public boolean isSameColumn(Position to) {
		return this.column == to.column;
	}

	public Position divideSelf() {
		if (this.row == Row.A) {
			return new Position(Row.A, column.divideSelf());
		}
		if (this.column == Column.ONE) {
			return new Position(row.divideSelf(), Column.ONE);
		}
		return new Position(row.divideSelf(), column.divideSelf());
	}

	public Row getRow() {
		return row;
	}

	public Column getColumn() {
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

	@Override
	public String toString() {
		return row + " " + column + " " + name;
	}
}
