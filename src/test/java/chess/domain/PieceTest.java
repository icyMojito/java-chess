package chess.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import chess.domain.piece.Piece;

class PieceTest {
	@Test
	@DisplayName("체스말의 생존 여부를 잘 반환하는지 확인")
	void aliveTest() {
		Piece piece = new Piece(Position.of("a1"), Team.BLACK);
		assertThat(piece.isAlive()).isTrue();
	}

	@Test
	@DisplayName("같은 팀이 아닌 경우 False를 정상 반환한다.")
	void isNotSameTeamTest() {
		Piece first = new Piece(Position.of("a1"), Team.BLACK);
		Piece second = new Piece(Position.of("a1"), Team.WHITE);
		assertThat(first.isSameTeam(second)).isFalse();
	}

	@Test
	@DisplayName("같은 팀인 경우 True를 정상 반환한다.")
	void isSameTeamTest() {
		Piece first = new Piece(Position.of("a1"), Team.BLACK);
		Piece second = new Piece(Position.of("b1"), Team.BLACK);
		assertThat(first.isSameTeam(second)).isTrue();
	}
}