package beast.generator;

import beast.value.Number;

public interface NumberGenerator {
	Number getNext();
	boolean hasNext();
}
