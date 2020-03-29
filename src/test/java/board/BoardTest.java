package board;

import chess.domain.board.Board;
import chess.domain.board.Positions;
import chess.domain.piece.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class BoardTest {
    private static Board board;

    @BeforeAll
    static void setBoard() {
        board = new Board();
    }

    @ParameterizedTest
    @DisplayName("EmptyPiece가 있는 위치값이 입력되면 예외가 발생해야 함")
    @ValueSource(strings = {"a3", "b3", "c3", "d3", "e3", "f3", "g3", "h3",
            "a4", "b4", "c4", "d4", "e4", "f4", "g4", "h4",
            "a5", "b5", "c5", "d5", "e5", "f5", "g5", "h5",
            "a6", "b6", "c6", "d6", "e6", "f6", "g6", "h6"})
    void inputEmptyPiecePositionThenThrowException(String input) {
        Assertions.assertThatThrownBy(() -> board.findPiece(Positions.of(input))).hasMessage("움직일 수 있는 체스말이 없습니다.");
    }

    @Test
    @DisplayName("EmptyPiece가 아닌 체스말이 있는 위치값이 입력되면 해당 체스말을 반환해야 함")
    void inputPiecePositionThenReturnPiece() {
        Piece piece = board.findPiece(Positions.of("a1"));
        Assertions.assertThat(piece instanceof Rook).isTrue();

        piece = board.findPiece(Positions.of("b8"));
        Assertions.assertThat(piece instanceof Knight).isTrue();

        piece = board.findPiece(Positions.of("c1"));
        Assertions.assertThat(piece instanceof Bishop).isTrue();

        piece = board.findPiece(Positions.of("d8"));
        Assertions.assertThat(piece instanceof Queen).isTrue();

        piece = board.findPiece(Positions.of("e1"));
        Assertions.assertThat(piece instanceof King).isTrue();

        piece = board.findPiece(Positions.of("c2"));
        Assertions.assertThat(piece instanceof Pawn).isTrue();
    }

    @Test
    @DisplayName("초기화 상태에서는 Black King, White king이 모두 살아 있으므로 false를 반환해야 함")
    void isKingKilledReturnFalse() {
        Assertions.assertThat(board.isBlackKingKilled()).isFalse();
        Assertions.assertThat(board.isWhiteKingKilled()).isFalse();
    }
}
