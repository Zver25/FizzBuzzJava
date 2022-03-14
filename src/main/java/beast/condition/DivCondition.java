package beast.condition;

import beast.value.Number;

public class DivCondition implements Condition {
	private final int divider;

	public DivCondition(int divider) {
		this.divider = divider;
	}

	public boolean isTruthy(Number num) {
		return num.getNumber() % divider == 0;
	}
}
