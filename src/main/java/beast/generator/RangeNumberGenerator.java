package beast.generator;

import beast.value.Number;

public class RangeNumberGenerator implements NumberGenerator {
	private final int max;
	private int index;

	public RangeNumberGenerator(int min, int max) {
		this.index = min;
		this.max = max;

	}

	@Override
	public Number getNext() {
		return new Number(index++);
	}

	@Override
	public boolean hasNext() {
		return index < max;
	}
}
