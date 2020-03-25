package chess.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CellsTest {
	@Test
	void findCellByName() {
		Cells cells = new Cells();
		assertThat(cells.findCellBy("h3")).isInstanceOf(Cell.class);
	}
}