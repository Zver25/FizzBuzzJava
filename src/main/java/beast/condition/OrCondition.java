package beast.condition;

import beast.value.Number;

public class OrCondition implements Condition {
	private final Condition[] conditions;

	public OrCondition(Condition[] conditions) {
		this.conditions = conditions;
	}

	public boolean isTruthy(Number num) {
		for (Condition condition : conditions) {
			if (condition.isTruthy(num)) {
				return true;
			}
		}
		return false;
	}
}
