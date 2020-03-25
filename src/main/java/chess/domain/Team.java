package chess.domain;

public enum Team {
	WHITE,
	BLACK;

	public boolean isSameTeam(Team team) {
		return this == team;
	}

	public String change(String name) {
		if (this == WHITE) {
			return name.toLowerCase();
		}
		return name.toUpperCase();
	}
}
