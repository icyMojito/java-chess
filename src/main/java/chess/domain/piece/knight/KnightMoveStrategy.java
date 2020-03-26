package chess.domain.piece.knight;

import chess.domain.cell.Position;
import chess.domain.piece.MoveStrategy;

public class KnightMoveStrategy implements MoveStrategy {
	@Override
	public boolean apply(Position start, Position to) {
		return Math.abs(start.getRow() - to.getRow()) + Math.abs(start.getColumn() - to.getColumn()) == 3;
	}
}
