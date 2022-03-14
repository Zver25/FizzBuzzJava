package beast.value;

public class Number implements Label {
	private final int value;

	public Number(int value) {
		this.value = value;
	}

	@Override
	public String getLabel() {
		return String.valueOf(value);
	}

	public int getNumber() {
		return value;
	}
}
