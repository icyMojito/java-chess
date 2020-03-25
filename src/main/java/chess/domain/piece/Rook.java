package chess.domain.piece;

import chess.domain.Position;
import chess.domain.Team;

public class Rook extends Piece {
	public Rook(String name, Position position, Team team) {
		super(name, position, team);
	}

	@Override
	public boolean canMove(Position to) {
		return position.isSameRow(to) || position.isSameColumn(to);
	}
}
