package chess.domain.piece.bishop;

import chess.domain.cell.Position;
import chess.domain.piece.Piece;
import chess.domain.piece.Team;

public class Bishop extends Piece {
	public Bishop(String name, Position position, Team team) {
		super(name, position, team);
	}
}
