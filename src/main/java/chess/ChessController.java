package chess;

import chess.domain.Command;
import chess.domain.view.InputView;

public class ChessController {
	public static void main(String[] args) {
		Command.of(InputView.requestCommand()).run();
	}
}
