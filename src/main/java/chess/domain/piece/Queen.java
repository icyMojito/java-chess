package chess.domain.piece;

import chess.domain.Position;
import chess.domain.Team;

public class Queen extends Piece {
	public Queen(String name, Position position, Team team) {
		super(name, position, team);
	}

	@Override
	public boolean canMove(Position to) {
		return position.isSameRow(to) || position.isSameColumn(to)
			|| (Math.abs(position.getColumn() - to.getColumn()) == Math.abs(position.getRow() - to.getRow()));
	}
}
