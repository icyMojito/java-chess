package chess.domain;

import java.util.Objects;

import chess.domain.piece.Piece;

public class Cell {
	private final Position position;
	private Piece piece;

	public Cell(Position position, Piece piece) {
		this.position = position;
		this.piece = piece;
	}

	public boolean isSameTeam(Cell cell) {
		return piece.isSameTeam(cell.piece);
	}

	@Override
	public String toString() {
		if (Objects.isNull(piece)) {
			return ".";
		}
		return piece.getName();
	}

	public void setPiece(Piece piece) {
		this.piece = piece;
	}
}
