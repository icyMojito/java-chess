package chess.domain;

import java.util.Arrays;

public enum Command {
	START("start"),
	END("end");

	private String commandString;

	Command(String commandString) {
		this.commandString = commandString;
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

	public boolean isStart() {
		return this == START;
	}
}
