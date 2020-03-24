package chess.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import chess.exception.InvalidPositionException;

class PositionTest {
	@ParameterizedTest
	@ValueSource(strings = {"a1", "b5", "d5", "h8"})
	@DisplayName("of를 통해서 Position 인스턴스를 얻을 수 있다.")
	void ofTest(String input) {
		assertThat(Position.of(input)).isInstanceOf(Position.class);
	}

	@ParameterizedTest
	@ValueSource(strings = {"a9", "b0", "d9", "h9"})
	@DisplayName("범위를 벗어나는 포지션의 경우 예외를 반환하는지 테스트")
	void ofInvalidRange(String input) {
		assertThatThrownBy(() -> {
			Position.of(input);
		}).isInstanceOf(InvalidPositionException.class);
	}

	@Test
	@DisplayName("입력값이 Null인 경우 예외를 반환합니다.")
	void nullTest() {
		assertThatThrownBy(() -> {
			Position.of(null);
		}).isInstanceOf(InvalidPositionException.class);
	}
}