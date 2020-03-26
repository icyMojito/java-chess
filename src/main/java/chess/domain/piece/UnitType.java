package chess.domain.piece;

import java.util.Arrays;
import java.util.List;

import chess.domain.cell.Position;
import chess.domain.piece.bishop.BishopMoveStrategy;
import chess.domain.piece.bishop.BishopPathStrategy;
import chess.domain.piece.king.KingMoveStrategy;
import chess.domain.piece.king.KingPathStrategy;
import chess.domain.piece.knight.KnightMoveStrategy;
import chess.domain.piece.knight.KnightPathStrategy;
import chess.domain.piece.pawn.PawnMoveStrategy;
import chess.domain.piece.pawn.PawnPathStrategy;
import chess.domain.piece.queen.QueenMoveStrategy;
import chess.domain.piece.queen.QueenPathStrategy;
import chess.domain.piece.rook.RookMoveStrategy;
import chess.domain.piece.rook.RookPathStrategy;

public enum UnitType {
	KING("k", new KingMoveStrategy(), new KingPathStrategy()),
	Knight("n", new KnightMoveStrategy(), new KnightPathStrategy()),
	Rook("r", new RookMoveStrategy(), new RookPathStrategy()),
	Queen("q", new QueenMoveStrategy(), new QueenPathStrategy()),
	Pawn("p", new PawnMoveStrategy(), new PawnPathStrategy()),
	Bishop("b", new BishopMoveStrategy(), new BishopPathStrategy());

	private final String name;
	private final MoveStrategy moveStrategy;
	private final PathStrategy pathStrategy;

	public static UnitType of(String name) {
		return Arrays.stream(values())
			.filter(unit -> unit.name.equalsIgnoreCase(name))
			.findFirst()
			.orElseThrow(AssertionError::new);
	}

	UnitType(String name, MoveStrategy moveStrategy, PathStrategy pathStrategy) {
		this.name = name;
		this.moveStrategy = moveStrategy;
		this.pathStrategy = pathStrategy;
	}

	public boolean apply(Position position, Position to) {
		return this.moveStrategy.apply(position, to);
	}

	public List<Position> findPath(Position start, Position to) {
		return this.pathStrategy.findPath(start, to);
	}
}
