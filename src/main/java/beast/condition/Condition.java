package beast.condition;

import beast.value.Number;

public interface Condition {
	boolean isTruthy(Number num);
}
