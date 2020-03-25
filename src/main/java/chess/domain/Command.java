package chess.domain;

import java.util.Arrays;

import chess.service.GameEndService;
import chess.service.GameService;
import chess.service.GameStartService;

public enum Command {
	START("start", new GameStartService()),
	END("end", new GameEndService());

	private final String commandString;
	private final GameService gameService;

	Command(String commandString, GameService gameService) {
		this.commandString = commandString;
		this.gameService = gameService;
	}

	public static Command of(String input) {
		return Arrays.stream(values())
			.filter(v -> v.isEqualTo(input))
			.findFirst()
			.orElseThrow(() -> new IllegalArgumentException("start와 end가 아닌 값이 들어왔습니다."));
	}

	private boolean isEqualTo(String input) {
		return this.commandString.equals(input);
	}

	public void run() {
		this.gameService.run();
	}
}
