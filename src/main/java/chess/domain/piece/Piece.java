package chess.domain.piece;

import chess.domain.Position;
import chess.domain.Team;

public abstract class Piece {
	private boolean isAlive = true;
	private final String name;
	protected Position position;
	protected final Team team;

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

	public boolean isSameTeam(Team team) {
		return this.team == team;
	}

	public abstract boolean canMove(Position to);

	public String getName() {
		return this.name;
	}

	public void move(Position to) {
		this.position = to;
	}
}
