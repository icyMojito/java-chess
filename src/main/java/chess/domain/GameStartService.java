package chess.domain;

import chess.domain.view.InputView;
import chess.domain.view.OutputView;

public class GameStartService implements GameService {
	@Override
	public void run() {
		Cells cells = new Cells();
		OutputView.printCells(cells);

		while (true) {
			String moveCommand = InputView.requestMoveCommand();
			String[] split = moveCommand.split(" ");
			String positionA = split[1];
			String positionB = split[2];

			cells.move(positionA, positionB);
			OutputView.printCells(cells);
		}
	}
}
