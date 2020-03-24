package chess.domain.piece;

import chess.domain.Position;
import chess.domain.Team;

public class Piece {
	private boolean isAlive = true;
	private Position position;
	private final Team team;

	public Piece(Position position, Team team) {
		this.position = position;
		this.team = team;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public boolean isSameTeam(Piece piece) {
		return team.isSameTeam(piece.team);
	}
}
