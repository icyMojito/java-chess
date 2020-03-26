package chess.domain.piece.bishop;

import chess.domain.cell.Position;
import chess.domain.piece.MoveStrategy;

public class BishopMoveStrategy implements MoveStrategy {
	@Override
	public boolean apply(Position start, Position to) {
		Position result = start.minus(to);
		return Math.abs(result.getColumn().getColumnIntValue()) == Math.abs(result.getRow().getRowIntValue());
	}
}
