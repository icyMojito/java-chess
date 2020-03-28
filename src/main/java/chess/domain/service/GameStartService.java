package chess.domain.service;

import chess.domain.MoveCommand;
import chess.domain.board.Board;
import chess.domain.piece.Piece;
import chess.view.InputView;
import chess.view.OutputView;

public class GameStartService implements GameService {

    @Override
    public void run() {
        Board board = new Board();
        OutputView.printBoard(board);

        while (true) {
            MoveCommand moveCommand = new MoveCommand(InputView.requestMoveCommand());

            Piece piece;
            try {
                piece = board.findPiece(moveCommand.getSourcePosition());
            } catch (IllegalArgumentException e) {
                OutputView.printNoPieceMessage(e.getMessage());
                continue;
            }

        }
    }
}
