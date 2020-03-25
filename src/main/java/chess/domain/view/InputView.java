package chess.domain.view;

import java.util.Scanner;

public class InputView {
	private static final Scanner scanner = new Scanner(System.in);
	private static final String NEW_LINE = System.lineSeparator();

	public static String requestCommand() {
		System.out.println("체스 게임을 시작합니다.");
		System.out.println("게임 시작은 start, 종료는 end 명령을 입력하세요." + NEW_LINE);
		return scanner.nextLine();
	}

	public static String requestMoveCommand() {
		return scanner.nextLine();
	}
}
