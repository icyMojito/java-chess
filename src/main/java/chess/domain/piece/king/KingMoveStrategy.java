package chess.domain.piece.king;

import chess.domain.cell.Position;
import chess.domain.piece.MoveStrategy;

public class KingMoveStrategy implements MoveStrategy {
	@Override
	public boolean apply(Position start, Position to) {
		Position result = start.minus(to);
		return Math.abs(result.getColumn().getColumnIntValue()) <= 1 || Math.abs(result.getRow().getRowIntValue()) <= 1;
	}
}
