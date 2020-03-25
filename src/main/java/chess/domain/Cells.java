package chess.domain;

import java.util.Collections;
import java.util.List;

import chess.domain.piece.Piece;
import chess.exception.InvalidPositionException;

public class Cells {
	private static final List<Cell> cells = CellFactory.createInitBoard();

	public Cell findCellBy(String cellName) {
		return cells.stream()
			.filter(cell -> cell.isSameName(cellName))
			.findFirst()
			.orElseThrow(() -> new InvalidPositionException(cellName));
	}

	public List<Cell> getCells() {
		return Collections.unmodifiableList(cells);
	}

	public void move(String from, String to) {
		Cell cell = findCellBy(from);
		Cell to2 = findCellBy(to);
		Position to1 = new Position(to);
		if (cell.getPiece().canMove(to1)) {
			Piece piece = cell.getPiece();
			piece.move(to1);
			to2.setPiece(piece);
			System.out.println("움직일수있음");
			System.out.println(to2.getPiece());
		}
		// if (cell.move() && method(cellBy.getRoute()))
		// 	cellBy.move();
		// init();
	}
}
