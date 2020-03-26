package chess.domain.piece;

import java.util.Arrays;
import java.util.List;

import chess.domain.cell.Position;

public enum Direction {
	NORTH(0, 1),
	NORTHEAST(1, 1),
	EAST(1, 0),
	SOUTHEAST(1, -1),
	SOUTH(0, -1),
	SOUTHWEST(-1, -1),
	WEST(-1, 0),
	NORTHWEST(-1, 1),

	NNE(1, 2),
	NNW(-1, 2),
	SSE(1, -2),
	SSW(-1, -2),
	EEN(2, 1),
	EES(2, -1),
	WWN(-2, 1),
	WWS(-2, -1);

	private int xDegree;
	private int yDegree;

	private Direction(int xDegree, int yDegree) {
		this.xDegree = xDegree;
		this.yDegree = yDegree;
	}

	public static Direction of(Position position) {
		return Arrays.stream(values())
			.filter(value -> value.xDegree == position.getRow().getRowIntValue()
				&& value.yDegree == position.getColumn().getColumnIntValue())
			.findFirst()
			.orElseThrow(() -> new IllegalArgumentException("존재하지 않는 방향입니다."));
	}

	public int getXDegree() {
		return xDegree;
	}

	public int getYDegree() {
		return yDegree;
	}

	public static List linearDirection() {
		return Arrays.asList(NORTH, EAST, SOUTH, WEST);
	}

	public static List diagonalDirection() {
		return Arrays.asList(NORTHEAST, SOUTHEAST, SOUTHWEST, NORTHWEST);
	}

	public static List everyDirection() {
		return Arrays.asList(NORTH, EAST, SOUTH, WEST, NORTHEAST, SOUTHEAST, SOUTHWEST, NORTHWEST);
	}

	public static List knightDirection() {
		return Arrays.asList(NNE, NNW, SSE, SSW, EEN, EES, WWN, WWS);
	}

	public static List whitePawnDirection() {
		return Arrays.asList(NORTH, NORTHEAST, NORTHWEST);
	}

	public static List blackPawnDirection() {
		return Arrays.asList(SOUTH, SOUTHEAST, SOUTHWEST);
	}
}
