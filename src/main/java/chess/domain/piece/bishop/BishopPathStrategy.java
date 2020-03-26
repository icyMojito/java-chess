package chess.domain.piece.bishop;

import java.util.ArrayList;
import java.util.List;

import chess.domain.cell.Position;
import chess.domain.piece.Direction;
import chess.domain.piece.PathStrategy;

public class BishopPathStrategy implements PathStrategy {
	@Override
	public List<Position> findPath(Position start, Position destination) {
		List<Position> paths = new ArrayList<>();
		Position position = destination.minus(start).divideSelf();
		Direction direction = Direction.of(position);
		Position path = new Position(direction.getXDegree(), direction.getYDegree());
		if (!Direction.diagonalDirection().contains(direction)) {
			throw new IllegalArgumentException("갈 수 없는 방향입니다.");
		}
		while (destination.equals(start)) {
			paths.add(start.plus(path));
		}
		return paths;
	}
}
