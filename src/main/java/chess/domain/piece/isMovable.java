package chess.domain.piece;

import java.util.Arrays;
import java.util.function.BiFunction;

import chess.domain.Position;

public enum isMovable {
	KING("k", (position, to) ->
		Math.abs(position.getColumn() - to.getColumn()) <= 1 || Math.abs(position.getRow() - to.getRow()) <= 1),
	Knight("n", (position, to) ->
		(Math.abs(position.getRow() - to.getRow()) + Math.abs(position.getColumn() - to.getColumn())) == 3),
	Rook("r", (position, to) ->
		position.isSameRow(to) || position.isSameColumn(to)),
	Queen("q", (position, to) ->
		position.isSameRow(to) || position.isSameColumn(to) || (Math.abs(position.getColumn() - to.getColumn())
			== Math.abs(position.getRow() - to.getRow()))),
	Pawn("p", (position, to) ->
		Math.abs(position.getColumn() - to.getColumn()) == Math.abs(position.getRow() - to.getRow())),
	Bishop("b", (position, to) -> pawnMovable(position, to));

	private final String name;
	private final BiFunction<Position, Position, Boolean> isMovable;

	public static isMovable of(String name) {
		return Arrays.stream(values())
			.filter(unit -> unit.name.equalsIgnoreCase(name))
			.findFirst()
			.orElseThrow(AssertionError::new);
	}

	isMovable(String name, BiFunction<Position, Position, Boolean> isMovable) {
		this.name = name;
		this.isMovable = isMovable;
	}

	public boolean apply(Position position, Position to) {
		return this.isMovable.apply(position, to);
	}

	private static Boolean pawnMovable(Position position, Position to) {
		if ((position.getRow() == 1 || position.getRow() == 6)
			&& Math.abs(position.getRow() - to.getRow()) <= 2) {
			return true;
		}
		return Math.abs(position.getRow() - to.getRow()) == 1;
	}
}
