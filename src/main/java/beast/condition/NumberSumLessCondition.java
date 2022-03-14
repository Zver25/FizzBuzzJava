package beast.condition;

import beast.value.Number;

public class NumberSumLessCondition implements Condition {
	private final int lessThen;

	public NumberSumLessCondition(int lessThen) {
		this.lessThen = lessThen;
	}

	@Override
	public boolean isTruthy(Number num) {
		int i = num.getNumber();
		int sum = 0;
		while (i > 10) {
			sum += i % 10;
			i /= 10;
		}
		sum += i;
		return sum < lessThen;
	}
}
