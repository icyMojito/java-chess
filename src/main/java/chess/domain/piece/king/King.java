package chess.domain.piece.king;

import chess.domain.cell.Position;
import chess.domain.piece.Piece;
import chess.domain.piece.Team;

public class King extends Piece {
	public King(String name, Position position, Team team) {
		super(name, position, team);
	}
}
