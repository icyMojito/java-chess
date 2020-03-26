package chess.domain.cell;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PositionTest {
	@Test
	@DisplayName("Column과 Row를 인자로 받아 생성이 정상적으로 이루어지는지 테스트합니다.")
	void createByColumnWithRowTest() {
		assertThat(new Position(Row.E, Column.EIGHT)).isInstanceOf(Position.class);
	}

	@Test
	@DisplayName("int 두개를 인자로 받아 생성이 정상적으로 이루어지는지 테스트합니다.")
	void createByTwoInts() {
		assertThat(new Position(0, 7)).isInstanceOf(Position.class);
	}

	@Test
	@DisplayName("String(Name)을 인자로 받아 생성이 정상적으로 이루어지는지 테스트합니다.")
	void createByStringName() {
		assertThat(new Position("a2")).isInstanceOf(Position.class);
	}

	@Test
	@DisplayName("같은 열을 가진 포지션의 경우 정상적으로 반환하는지 테스트합니다.")
	void isSameRow() {
		assertThat(new Position(Row.C, Column.ONE).isSameRow(new Position(Row.C, Column.EIGHT))).isTrue();
	}

	@Test
	@DisplayName("다른 열을 가진 포지션의 경우 정상적으로 반환하는지 테스트합니다.")
	void isNotSameRow() {
		assertThat(new Position(Row.C, Column.ONE).isSameRow(new Position(Row.E, Column.EIGHT))).isFalse();
	}

	@Test
	@DisplayName("같은 행을 가진 경우 정상적으로 True를 반환합니다.")
	void isSameColumnTest() {
		assertThat(new Position(Row.E, Column.ONE).isSameColumn(new Position(Row.C, Column.ONE))).isTrue();
	}

	@Test
	@DisplayName("같지 않은 행을 가진 경우 정상적으로 True를 반환합니다.")
	void isNotSameColumnTest() {
		assertThat(new Position(Row.E, Column.ONE).isSameColumn(new Position(Row.C, Column.TWO))).isFalse();
	}

	@Test
	@DisplayName("오버라이딩한 Equals를 테스트합니다.")
	void equalsTest() {
		assertThat(new Position(1, 3).equals(new Position(1, 3))).isTrue();
	}
}