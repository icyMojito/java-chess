package chess.domain.piece.bishop;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import chess.domain.cell.Position;

class BishopMoveStrategyTest {
	@ParameterizedTest
	@ValueSource(strings = {"c4,e4,e6,c6"})
	@DisplayName("비숍의 경우 정상적으로 이동할 수 있는 경우 True를 반환합니다.")
	void bishopCanMoveTest(String input) {
		BishopMoveStrategy strategy = new BishopMoveStrategy();
		boolean result = strategy.apply(new Position("d5"), new Position(input));
		assertThat(result).isTrue();
	}

	@ParameterizedTest
	@ValueSource(strings = {"c7,e5,e3,c7"})
	@DisplayName("비숍의 경우 정상적으로 이동할 수 있는 경우 True를 반환합니다.")
	void bishopCanNotMoveTest(String input) {
		BishopMoveStrategy strategy = new BishopMoveStrategy();
		boolean result = strategy.apply(new Position("d5"), new Position(input));
		assertThat(result).isFalse();
	}
}