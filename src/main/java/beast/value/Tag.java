package beast.value;

public class Tag implements Label {
	private final String value;

	public Tag(String value) {
		this.value = value;
	}

	@Override
	public String getLabel() {
		return value;
	}
}
