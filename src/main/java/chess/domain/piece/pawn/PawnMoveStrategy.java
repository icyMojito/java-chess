package chess.domain.piece.pawn;

import chess.domain.cell.Position;
import chess.domain.piece.MoveStrategy;

public class PawnMoveStrategy implements MoveStrategy {
	@Override
	public boolean apply(Position start, Position to) {
		if ((start.getRow() == 1 || start.getRow() == 6)
			&& Math.abs(start.getRow() - to.getRow()) <= 2) {
			return true;
		}
		return Math.abs(start.getRow() - to.getRow()) == 1;
	}
}
