package chess.domain.view;

import org.junit.jupiter.api.Test;

import chess.domain.Cells;

class OutputViewTest {
	@Test
	void name() {
		Cells cells = new Cells();
		OutputView.printCells(cells);
	}
}