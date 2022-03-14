package beast.generator;

import beast.value.Number;

public class UnionNumberGenerator implements NumberGenerator {
	private final NumberGenerator firstGenerator;
	private final NumberGenerator secondGenerator;

	public UnionNumberGenerator(NumberGenerator firstGenerator, NumberGenerator secondGenerator) {
		this.firstGenerator = firstGenerator;
		this.secondGenerator = secondGenerator;

	}

	@Override
	public Number getNext() {
		if (firstGenerator.hasNext()) {
			return firstGenerator.getNext();
		}
		return secondGenerator.getNext();
	}

	@Override
	public boolean hasNext() {
		return firstGenerator.hasNext() || secondGenerator.hasNext();
	}
}
