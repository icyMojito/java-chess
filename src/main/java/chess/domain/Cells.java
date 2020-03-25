package chess.domain;

import java.util.Collections;
import java.util.List;

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
		Cell start = findCellBy(from);
		Cell destination = findCellBy(to);
		Position position = new Position(to);

		if (start.canMove(position)) {
			start.move(position);
			destination.setPiece(start.getPiece());
		}
		// TODO: 2020/03/25 판 입장에서 갈 수 있는지를 판단하고
		// TODO: 2020/03/25 판입장에서 판단하려면, 가기 위한 경로를 알아야하고 (Piece의 역할)
		// TODO: 2020/03/25 경로를 받아서, 경로내에 아군이 하나라도 있으면 못가고 메서드 분리
		// TODO: 2020/03/25 적군이면 경로내에 있으면 못가고 없으면 갈 수 있다.
		// TODO: 2020/03/25 이동한 경우 초기화
	}
}
