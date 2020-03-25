package chess.controller;

import chess.domain.Command;
import chess.domain.view.InputView;

public class ChessController {
	public void run() {
		Command.of(InputView.requestCommand()).run();
	}
}
