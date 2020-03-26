package chess.service;

public class GameEndService implements GameService {
	private int NORMAL_EXIT_NUMBER = 0;

	@Override
	public void run() {
		System.exit(NORMAL_EXIT_NUMBER);
	}
}
