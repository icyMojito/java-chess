package chess.domain.piece.pawn;

import chess.domain.cell.Position;
import chess.domain.piece.Piece;
import chess.domain.piece.Team;

public class Pawn extends Piece {
	public Pawn(String name, Position position, Team team) {
		super(name, position, team);
	}
}
