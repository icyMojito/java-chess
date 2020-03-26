package chess.domain.piece.knight;

import chess.domain.cell.Position;
import chess.domain.piece.MoveStrategy;

public class KnightMoveStrategy implements MoveStrategy {
	@Override
	public boolean apply(Position start, Position to) {
		Position result = start.minus(to);
		return Math.abs(result.getRow().getRowIntValue()) + Math.abs(result.getColumn().getColumnIntValue()) == 3;
	}
}
