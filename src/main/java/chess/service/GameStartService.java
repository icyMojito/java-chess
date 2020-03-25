package chess.service;

import chess.domain.Cells;
import chess.domain.view.InputView;
import chess.domain.view.OutputView;

public class GameStartService implements GameService {
	@Override
	public void run() {
		Cells cells = new Cells();
		OutputView.printCells(cells);

		while (true) {
			String moveCommand = InputView.requestMoveCommand();
			String[] input = moveCommand.split(" ");
			String start = input[1];
			String destination = input[2];

			cells.move(start, destination);
			OutputView.printCells(cells);
		}
	}
}
