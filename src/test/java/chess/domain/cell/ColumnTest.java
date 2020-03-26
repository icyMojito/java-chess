package chess.domain.cell;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ColumnTest {
	@Test
	@DisplayName("정상적으로 생성되는지 확인합니다.")
	void fromTest() {
		Column from = Column.from(1);
		assertThat(from).isEqualTo(Column.TWO);
	}

	@ParameterizedTest
	@ValueSource(ints = {-1, 8})
	@DisplayName("범위 밖의 입력에 대해 예외를 반환합니다.")
	void inValidFromTest(int value) {
		assertThatThrownBy(() -> {
			Column.from(value);
		}).isInstanceOf(IllegalArgumentException.class);
	}

	@Test
	@DisplayName("Name을 기반으로 정상적으로 생성되는지 확인합니다.")
	void fromNameTest() {
		Column from = Column.fromName("8");
		assertThat(from).isEqualTo(Column.EIGHT);
	}

	@ParameterizedTest
	@ValueSource(strings = {"0", "9"})
	@DisplayName("범위 밖의 이름 입력에 대해 예외를 반환합니다.")
	void invalidNameFromTest(String value) {
		assertThatThrownBy(() -> {
			Column.fromName(value);
		}).isInstanceOf(IllegalArgumentException.class);
	}

	@Test
	@DisplayName("플러스 연산을 정상적으로 수행하는지 테스트합니다.")
	void plusTest() {
		assertThat(Column.FOUR.plus(Column.THREE)).isEqualTo(Column.SIX);
	}

	@Test
	@DisplayName("플러스 연산에서 범위를 벗어나는 경우 예외를 정상 반환하는지")
	void invalidPlusTest() {
		assertThatThrownBy(() -> Column.FIVE.plus(Column.FIVE)).isInstanceOf(IllegalArgumentException.class);
	}

	@Test
	@DisplayName("빼기 연산을 정상적으로 수행하는지 테스트합니다.")
	void minusTest() {
		assertThat(Column.FIVE.minus(Column.THREE)).isEqualTo(Column.THREE);
	}

	@Test
	@DisplayName("자기 자신을 나누는 경우 정상적 결과를 반환하는지")
	void divideSelfTest() {
		assertThat(Column.FOUR.divideSelf()).isEqualTo(Column.TWO);
	}
}