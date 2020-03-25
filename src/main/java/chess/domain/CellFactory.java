package chess.domain;

import java.util.ArrayList;
import java.util.List;

import chess.domain.piece.Bishop;
import chess.domain.piece.King;
import chess.domain.piece.Knight;
import chess.domain.piece.Pawn;
import chess.domain.piece.Queen;
import chess.domain.piece.Rook;

public class CellFactory {
	public static List<Cell> createInitBoard() {
		List<Cell> cells = new ArrayList<>();
		createEmptyBoard(cells);
		setInitPieces(cells);
		return cells;
	}

	private static void createEmptyBoard(List<Cell> cells) {
		for (int i = 7; i >= 0; i--) {
			for (int j = 0; j < 8; j++) {
				cells.add(new Cell(new Position(i, j), name(i, j), null));
			}
		}
	}

	private static String name(int i, int j) {
		return String.valueOf((char)(j + 'a')) + (i + 1);
	}

	public static void setInitPieces(List<Cell> cells) {
		setInitBlackPieces(cells);
		setInitWhitePieces(cells);
	}

	private static void setInitBlackPieces(List<Cell> cells) {
		cells.get(0).setPiece(new Rook("r", new Position(7, 0), Team.BLACK));
		cells.get(1).setPiece(new Knight("n", new Position(7, 1), Team.BLACK));
		cells.get(2).setPiece(new Bishop("b", new Position(7, 2), Team.BLACK));
		cells.get(3).setPiece(new Queen("q", new Position(7, 3), Team.BLACK));
		cells.get(4).setPiece(new King("k", new Position(7, 4), Team.BLACK));
		cells.get(5).setPiece(new Bishop("b", new Position(7, 5), Team.BLACK));
		cells.get(6).setPiece(new Knight("n", new Position(7, 6), Team.BLACK));
		cells.get(7).setPiece(new Rook("r", new Position(7, 7), Team.BLACK));
		for (int i = 8; i < 16; i++) {
			cells.get(i).setPiece(new Pawn("p", new Position(6, i - 8), Team.BLACK));
		}
	}

	private static void setInitWhitePieces(List<Cell> cells) {
		for (int i = 48; i < 56; i++) {
			cells.get(i).setPiece(new Pawn("p", new Position(1, i - 48), Team.WHITE));
		}
		cells.get(56).setPiece(new Rook("r", new Position(0, 0), Team.WHITE));
		cells.get(57).setPiece(new Knight("n", new Position(0, 1), Team.WHITE));
		cells.get(58).setPiece(new Bishop("b", new Position(0, 2), Team.WHITE));
		cells.get(59).setPiece(new Queen("q", new Position(0, 3), Team.WHITE));
		cells.get(60).setPiece(new King("k", new Position(0, 4), Team.WHITE));
		cells.get(61).setPiece(new Bishop("b", new Position(0, 5), Team.WHITE));
		cells.get(62).setPiece(new Knight("n", new Position(0, 6), Team.WHITE));
		cells.get(63).setPiece(new Rook("r", new Position(0, 7), Team.WHITE));
	}
}
