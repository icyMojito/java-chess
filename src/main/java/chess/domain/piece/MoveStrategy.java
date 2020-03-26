package chess.domain.piece;

import chess.domain.cell.Position;

public interface MoveStrategy {
	boolean apply(Position start, Position to);
}
