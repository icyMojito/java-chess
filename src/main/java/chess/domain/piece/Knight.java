package chess.domain.piece;

import chess.domain.Position;
import chess.domain.Team;

public class Knight extends Piece {
	public Knight(String name, Position position, Team team) {
		super(name, position, team);
	}

	@Override
	public boolean canMove(Position to) {
		return (Math.abs(position.getRow() - to.getRow()) + Math.abs(position.getColumn() - to.getColumn())) == 3;
	}
}
