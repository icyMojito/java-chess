// package chess.domain;
//
// import static org.assertj.core.api.Assertions.*;
//
// import org.junit.jupiter.api.DisplayName;
// import org.junit.jupiter.api.Test;
//
// import chess.domain.piece.Piece;
//
// class CellTest {
// 	@Test
// 	@DisplayName("같은 색의 말이 들어왔을 때 같다고 셀이 확인해주는지 테스트")
// 	void sameTeamCellTest() {
// 		Cell cell1 = new Cell(Position.of("a1"), new Piece(Position.of("a1"), Team.BLACK));
// 		Cell cell2 = new Cell(Position.of("a2"), new Piece(Position.of("a2"), Team.BLACK));
// 		assertThat(cell1.isSameTeam(cell2)).isTrue();
// 	}
// }