package chess.domain.piece.queen;

import chess.domain.cell.Position;
import chess.domain.piece.MoveStrategy;

public class QueenMoveStrategy implements MoveStrategy {
	@Override
	public boolean apply(Position start, Position to) {
		Position result = start.minus(to);
		return start.isSameRow(to) || start.isSameColumn(to)
			|| (Math.abs(result.getColumn().getColumnIntValue()) == Math.abs(result.getRow().getRowIntValue()));
	}
}
