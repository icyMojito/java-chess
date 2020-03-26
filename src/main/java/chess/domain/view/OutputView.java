package chess.domain.view;

import java.util.List;

import chess.domain.cell.Cell;
import chess.domain.cell.Cells;

public class OutputView {
	private static final String NEW_LINE = System.lineSeparator();

	public static void printCells(Cells cells) {
		List<Cell> board = cells.getCells();
		System.out.print(NEW_LINE + board.get(0) + " ");
		for (int i = 1; i < board.size(); i++) {
			if (i % 8 == 0) {
				System.out.println();
			}
			System.out.print(board.get(i) + " ");
		}
	}
}
