package chess.domain;

import java.util.Objects;

import chess.domain.piece.Piece;

public class Cell {
	private final Position position;
	private final String name;
	private Piece piece;

	public Cell(Position position, String name, Piece piece) {
		this.position = position;
		this.name = name;
		this.piece = piece;
	}

	public boolean isSameTeam(Cell cell) {
		return piece.isSameTeam(cell.piece);
	}

	public boolean isSameTeam(Team team) {
		return piece.isSameTeam(team);
	}

	public boolean isSameName(String input) {
		return this.name.equals(input);
	}

	public void setPiece(Piece piece) {
		this.piece = piece;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		if (Objects.isNull(piece)) {
			return ".";
		}
		return piece.getName();
	}

	public boolean hasPiece() {
		return Objects.nonNull(piece);
	}

	public Piece getPiece() {
		return piece;
	}

	public Position getPosition() {
		return position;
	}
}
