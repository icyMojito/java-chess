package chess.domain;

public enum Row {
	A("a"),
	B("b"),
	C("c"),
	D("d"),
	E("e"),
	F("f"),
	G("g"),
	H("h");

	private final String name;

	Row(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
