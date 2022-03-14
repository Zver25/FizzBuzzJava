package beast.rule;

import beast.condition.Condition;
import beast.value.Number;
import beast.value.Tag;
import beast.value.Label;

public class TagNumRule implements Rule {
	private final Tag tag;
	private final Condition condition;

	public TagNumRule(Tag tag, Condition condition) {
		this.tag = tag;
		this.condition = condition;
	}

	public Label getValue() {
		return tag;
	}

	public boolean isSuccess(Number num) {
		return condition.isTruthy(num);
	}
}
