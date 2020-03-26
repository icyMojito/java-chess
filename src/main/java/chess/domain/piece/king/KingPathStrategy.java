package chess.domain.piece.king;

import java.util.ArrayList;
import java.util.List;

import chess.domain.cell.Position;
import chess.domain.piece.Direction;
import chess.domain.piece.PathStrategy;

public class KingPathStrategy implements PathStrategy {
	@Override
	public List<Position> findPath(Position start, Position destination) {
		List<Position> paths = new ArrayList<>();
		Position position = destination.minus(start);
		Direction direction = Direction.of(position);
		Position path = new Position(direction.getXDegree(), direction.getYDegree());

		if (!position.equals(path) || !Direction.everyDirection().contains(direction)) {
			throw new IllegalArgumentException("이동할 수 없습니다.");
		}
		while (destination.equals(start)) {
			paths.add(start.plus(path));
		}
		return paths;
	}
}
