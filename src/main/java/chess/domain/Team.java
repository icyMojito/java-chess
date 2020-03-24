package chess.domain;

public enum Team {
	WHITE,
	BLACK;

	public boolean isSameTeam(Team team) {
		return this == team;
	}
}
