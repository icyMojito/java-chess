package chess.domain.piece;

import chess.domain.Position;
import chess.domain.Team;

public class Bishop extends Piece {
	public Bishop(String name, Position position, Team team) {
		super(name, position, team);
	}

	@Override
	public boolean canMove(Position to) {
		return Math.abs(position.getColumn() - to.getColumn()) == Math.abs(position.getRow() - to.getRow());
	}
}
