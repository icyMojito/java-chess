package chess.domain.piece;

import chess.domain.Position;
import chess.domain.Team;

public class King extends Piece {

	public King(String name, Position position, Team team) {
		super(name, position, team);
	}

	@Override
	public boolean canMove(Position to) {
		return Math.abs(position.getColumn() - to.getColumn()) <= 1 ||
			Math.abs(position.getRow() - to.getRow()) <= 1;
	}
}
