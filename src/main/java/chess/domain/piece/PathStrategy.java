package chess.domain.piece;

import java.util.List;

import chess.domain.cell.Position;

public interface PathStrategy {
	List<Position> findPath(Position start, Position to);
}
