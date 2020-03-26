package chess.domain.piece.king;

import chess.domain.cell.Position;
import chess.domain.piece.MoveStrategy;

public class KingMoveStrategy implements MoveStrategy {
	@Override
	public boolean apply(Position start, Position to) {
		return Math.abs(start.getColumn() - to.getColumn()) <= 1 || Math.abs(start.getRow() - to.getRow()) <= 1;
	}
}
