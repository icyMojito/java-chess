package chess.domain.piece;

import chess.domain.Position;
import chess.domain.Team;

public class Piece {
	private final String name;
	private Position position;
	private final Team team;

	public Piece(String name, Position position, Team team) {
		this.name = team.change(name);
		this.position = position;
		this.team = team;
	}

	public boolean isSameTeam(Piece piece) {
		return team.isSameTeam(piece.team);
	}

	public boolean isSameTeam(Team team) {
		return this.team == team;
	}

	public boolean canMove(Position to) {
		return isMovable.of(name).apply(position, to);
	}

	public String getName() {
		return this.name;
	}

	public void move(Position to) {
		this.position = to;
	}
}
