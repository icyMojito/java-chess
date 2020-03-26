package chess.domain.piece.queen;

import chess.domain.cell.Position;
import chess.domain.piece.MoveStrategy;

public class QueenMoveStrategy implements MoveStrategy {
	@Override
	public boolean apply(Position start, Position to) {
		return start.isSameRow(to) || start.isSameColumn(to)
			|| (Math.abs(start.getColumn() - to.getColumn()) == Math.abs(start.getRow() - to.getRow()));
	}
}
