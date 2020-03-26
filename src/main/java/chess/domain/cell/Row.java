package chess.domain.cell;

import java.util.Arrays;

public enum Row {
	A("a", 0),
	B("b", 1),
	C("c", 2),
	D("d", 3),
	E("e", 4),
	F("f", 5),
	G("g", 6),
	H("h", 7);

	private final String name;
	private final int rowIntValue;

	Row(String name, int value) {
		this.name = name;
		this.rowIntValue = value;
	}

	public static Row from(int rowValue) {
		return Arrays.stream(values())
			.filter(value -> value.rowIntValue == rowValue)
			.findFirst()
			.orElseThrow(() -> new IllegalArgumentException("존재하지 않는 칼럼입니다."));
	}

	public static Row fromName(String name) {
		return Arrays.stream(values())
			.filter(value -> value.name.equals(name))
			.findFirst()
			.orElseThrow(() -> new IllegalArgumentException("존재하지 않는 칼럼입니다."));
	}

	public Row minus(Row other) {
		return from(this.rowIntValue - other.rowIntValue);
	}

	public Row plus(Row other) {
		return from(this.rowIntValue + other.rowIntValue);
	}

	public Row divideSelf() {
		return from(rowIntValue / Math.abs(rowIntValue));
	}

	public String getName() {
		return name;
	}

	public int getRowIntValue() {
		return rowIntValue;
	}
}
