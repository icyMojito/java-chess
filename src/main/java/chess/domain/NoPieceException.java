package chess.domain;

public class NoPieceException extends RuntimeException {
	public NoPieceException(String message) {
		super(message);
	}
}
