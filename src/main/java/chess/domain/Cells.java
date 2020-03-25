package chess.domain;

import java.util.Collections;
import java.util.List;

public class Cells {
	private static final List<Cell> cells = CellFactory.createInitBoard();

	public List<Cell> getCells() {
		return Collections.unmodifiableList(cells);
	}
}
