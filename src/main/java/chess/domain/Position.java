package chess.domain;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Position {
	private static final Map<String, Position> positions = new HashMap<>();

	private final String row;
	private final String column;

	public Position(String row, String column) {
		this.row = row;
		this.column = column;
	}

	static {
		for (Row row : Row.values()) {
			for (Column column1 : Column.values()) {
				positions.put(row.getName() + column1.getColumn(), new Position(row.getName(), column1.getColumn()));
			}
		}
	}

	public static Position of(String input) {
		validate(input);
		return positions.get(input);
	}

	private static void validate(String input) {
		checkNull(input);
		checkEmptyValue(input);
	}

	private static void checkNull(String input) {
		if (Objects.isNull(input)) {
			throw new InvalidPositionException(input);
		}
	}

	private static void checkEmptyValue(String input) {
		if (Objects.isNull(positions.get(input))) {
			throw new InvalidPositionException(input);
		}
	}
}
