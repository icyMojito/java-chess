package chess.service;

import chess.domain.cell.Cells;
import chess.domain.view.InputView;
import chess.domain.view.OutputView;

public class GameStartService implements GameService {
	private static final int FIRST_POSITION_INDEX = 1;
	private static final int SECOND_POSITION_INDEX = 2;
	public static final String DELIMITER = " ";

	@Override
	public void run() {
		Cells cells = new Cells();
		OutputView.printCells(cells);

		while (true) {
			String[] input = InputView.requestMoveCommand().split(DELIMITER);
			cells.move(input[FIRST_POSITION_INDEX], input[SECOND_POSITION_INDEX]);
			OutputView.printCells(cells);
		}
	}
}
