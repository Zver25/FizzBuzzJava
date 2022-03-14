package beast.rule;

import beast.value.Number;
import beast.value.Label;

public class RuleList {
	private final Rule[] rules;

	public RuleList(Rule[] aRules) {
		rules = aRules;
	}

	public Label match(Number num) {
		for (Rule rule : rules) {
			if (rule.isSuccess(num)) {
				return rule.getValue();
			}
		}
		return num;
	}
}
