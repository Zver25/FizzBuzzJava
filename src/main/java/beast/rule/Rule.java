package beast.rule;

import beast.value.Number;
import beast.value.Label;

public interface Rule {
	Label getValue();

	boolean isSuccess(Number num);
}
