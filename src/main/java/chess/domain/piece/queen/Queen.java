package chess.domain.piece.queen;

import chess.domain.cell.Position;
import chess.domain.piece.Piece;
import chess.domain.piece.Team;

public class Queen extends Piece {
	public Queen(String name, Position position, Team team) {
		super(name, position, team);
	}
}
