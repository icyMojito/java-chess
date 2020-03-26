package chess.domain.cell;

import java.util.Arrays;

public enum Column {
	EIGHT("8", 7, -7),
	SEVEN("7", 6, -6),
	SIX("6", 5, -5),
	FIVE("5", 4, -4),
	FOUR("4", 3, -3),
	THREE("3", 2, -2),
	TWO("2", 1, -1),
	ONE("1", 0, 0);

	private final String column;
	private final int columnIntValue;
	private final int minusColumnInt;

	Column(String column, int columnIntValue, int minusColumnInt) {
		this.column = column;
		this.columnIntValue = columnIntValue;
		this.minusColumnInt = minusColumnInt;
	}

	public static Column from(int columnIntValue) {
		return Arrays.stream(values())
			.filter(value -> value.columnIntValue == columnIntValue || value.minusColumnInt == columnIntValue)
			.findFirst()
			.orElseThrow(() -> new IllegalArgumentException("존재하지 않는 칼럼입니다."));
	}

	public static Column fromName(String input) {
		return Arrays.stream(values())
			.filter(value -> value.column.equalsIgnoreCase(input))
			.findFirst()
			.orElseThrow(() -> new IllegalArgumentException("존재하지 않는 칼럼입니다."));
	}

	public String getName() {
		return column;
	}

	public Column minus(Column other) {
		return from(this.columnIntValue - other.columnIntValue);
	}

	public Column plus(Column other) {
		return from(this.columnIntValue + other.columnIntValue);
	}

	public int getColumnIntValue() {
		return columnIntValue;
	}

	public Column divideSelf() {
		return from(this.columnIntValue / Math.abs(columnIntValue));
	}
}
