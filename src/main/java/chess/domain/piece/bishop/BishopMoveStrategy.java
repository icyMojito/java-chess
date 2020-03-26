package chess.domain.piece.bishop;

import chess.domain.cell.Position;
import chess.domain.piece.MoveStrategy;

public class BishopMoveStrategy implements MoveStrategy {
	@Override
	public boolean apply(Position start, Position to) {
		return Math.abs(start.getColumn() - to.getColumn())
			== Math.abs(start.getRow() - to.getRow());
	}
}
