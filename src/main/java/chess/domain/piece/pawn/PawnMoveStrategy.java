package chess.domain.piece.pawn;

import chess.domain.cell.Position;
import chess.domain.cell.Row;
import chess.domain.piece.MoveStrategy;

public class PawnMoveStrategy implements MoveStrategy {
	@Override
	public boolean apply(Position start, Position to) {
		Position result = start.minus(to);
		if ((start.getRow() == Row.B || start.getRow() == Row.G)
			&& Math.abs(result.getColumn().getColumnIntValue()) <= 2) {
			return true;
		}
		return Math.abs(result.getColumn().getColumnIntValue()) == 1;
	}
}
