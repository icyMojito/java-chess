package chess.domain.cell;

public enum Row {
	A('a'),
	B('b'),
	C('c'),
	D('d'),
	E('e'),
	F('f'),
	G('g'),
	H('h');

	private final Character name;

	Row(Character name) {
		this.name = name;
	}

	public Character getName() {
		return name;
	}
}
