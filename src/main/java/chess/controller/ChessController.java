package chess.controller;

import chess.Command;
import chess.domain.view.InputView;

public class ChessController {
	public void run() {
		Command.of(InputView.requestCommand()).run();
	}
}
