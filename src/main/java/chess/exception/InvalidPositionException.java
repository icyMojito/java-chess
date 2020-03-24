package chess.exception;

public class InvalidPositionException extends RuntimeException {
	public InvalidPositionException(String message) {
		super(String.format("%s 는 존재하지 않는 포지션입니다.", message));
	}
}
