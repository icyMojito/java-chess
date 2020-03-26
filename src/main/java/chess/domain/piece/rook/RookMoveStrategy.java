package chess.domain.piece.rook;

import chess.domain.cell.Position;
import chess.domain.piece.MoveStrategy;

public class RookMoveStrategy implements MoveStrategy {
	@Override
	public boolean apply(Position start, Position to) {
		return start.isSameRow(to) || start.isSameColumn(to);
	}
}
