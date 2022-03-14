package beast.rule;

import beast.generator.NumberGenerator;
import beast.printer.Printer;

public class RulesRunner {
	private final NumberGenerator numberGenerator;
	private final RuleList rules;
	private final Printer printer;

	public RulesRunner(RuleList aRules, NumberGenerator aNumberGenerator, Printer aPrinter) {
		rules = aRules;
		numberGenerator = aNumberGenerator;
		printer = aPrinter;
	}

	public void run() {
		while (numberGenerator.hasNext()) {
			printer.print(rules.match(numberGenerator.getNext()));
		}
	}
}
