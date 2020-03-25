package chess.domain.piece;

import chess.domain.Position;
import chess.domain.Team;

public class Piece {
	private boolean isAlive = true;
	private final String name;
	private Position position;
	private final Team team;

	public Piece(String name, Position position, Team team) {
		this.name = team.change(name);
		this.position = position;
		this.team = team;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public boolean isSameTeam(Piece piece) {
		return team.isSameTeam(piece.team);
	}

	public String getName() {
		return this.name;
	}
}
