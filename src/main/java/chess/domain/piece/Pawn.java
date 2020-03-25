package chess.domain.piece;

import chess.domain.Position;
import chess.domain.Team;

public class Pawn extends Piece {
	public Pawn(String name, Position position, Team team) {
		super(name, position, team);
	}

	@Override
	public boolean canMove(Position to) {
		if ((position.getRow() == 1 || position.getRow() == 6)
			&& Math.abs(position.getColumn() - to.getColumn()) <= 2) {
			return true;
		}
		return Math.abs(position.getRow() - to.getRow()) == 1;
	}
}
