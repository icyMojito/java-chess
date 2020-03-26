package chess.domain.cell;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class RowTest {
	@Test
	@DisplayName("정상적으로 생성되는지 확인합니다.")
	void fromTest() {
		Row from = Row.from(1);
		assertThat(from).isEqualTo(Row.B);
	}

	@ParameterizedTest
	@ValueSource(ints = {-1, 8})
	@DisplayName("범위 밖의 입력에 대해 예외를 반환합니다.")
	void inValidFromTest(int value) {
		assertThatThrownBy(() -> {
			Row.from(value);
		}).isInstanceOf(IllegalArgumentException.class);
	}

	@Test
	@DisplayName("Name을 기반으로 정상적으로 생성되는지 확인합니다.")
	void fromNameTest() {
		Row from = Row.fromName("b");
		assertThat(from).isEqualTo(Row.B);
	}

	@ParameterizedTest
	@ValueSource(strings = {"i", "j"})
	@DisplayName("범위 밖의 이름 입력에 대해 예외를 반환합니다.")
	void invalidNameFromTest(String value) {
		assertThatThrownBy(() -> {
			Row.fromName(value);
		}).isInstanceOf(IllegalArgumentException.class);
	}

	@Test
	@DisplayName("플러스 연산을 정상적으로 수행하는지 테스트합니다.")
	void plusTest() {
		assertThat(Row.B.plus(Row.C)).isEqualTo(Row.D);
	}

	@Test
	@DisplayName("플러스 연산에서 범위를 벗어나는 경우 예외를 정상 반환하는지")
	void invalidPlusTest() {
		assertThatThrownBy(() -> Row.H.plus(Row.H)).isInstanceOf(IllegalArgumentException.class);
	}

	@Test
	@DisplayName("빼기 연산을 정상적으로 수행하는지 테스트합니다.")
	void minusTest() {
		assertThat(Row.C.minus(Row.B)).isEqualTo(Row.B);
	}

	@Test
	@DisplayName("자기 자신을 나누는 경우 정상적 결과를 반환하는지")
	void divideSelfTest() {
		assertThat(Row.B.divideSelf()).isEqualTo(Row.B);
	}
}