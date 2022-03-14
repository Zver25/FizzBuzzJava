package beast.condition;

import beast.value.Number;

public class AndCondition implements Condition {
	private final Condition[] conditions;

	public AndCondition(Condition[] conditions) {
		this.conditions = conditions;
	}

	public boolean isTruthy(Number num) {
		for (Condition condition : conditions) {
			if (!condition.isTruthy(num)) {
				return false;
			}
		}
		return true;
	}
}
