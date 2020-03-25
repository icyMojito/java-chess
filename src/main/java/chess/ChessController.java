package chess;

import chess.domain.Cells;
import chess.domain.Command;
import chess.domain.view.InputView;
import chess.domain.view.OutputView;

public class ChessController {
	public static void main(String[] args) {
		Command command = Command.of(InputView.requestCommand());
		Cells cells = new Cells();
		if (command.isStart()) {
			OutputView.printCells(cells);
		}
	}
}
