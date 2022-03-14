package beast;

import beast.condition.*;
import beast.generator.NumberGenerator;
import beast.generator.RangeNumberGenerator;
import beast.printer.ConsolePrinter;
import beast.rule.Rule;
import beast.rule.RuleList;
import beast.rule.RulesRunner;
import beast.rule.TagNumRule;
import beast.value.Tag;

public class Main {

	private static final int max = 10_000;

	private static int numberSum(int i) {
		int j = i;
		int sumNum = 0;
		while (j > 10) {
			sumNum += j % 10;
			j /= 10;
		}
		sumNum += j;
		return sumNum;
	}

	private static void oopSolve() {
		RuleList rules = new RuleList(new Rule[]{
			new TagNumRule(new Tag("FizzBuzz"),
				new AndCondition(new Condition[]{
					new DivCondition(3),
					new DivCondition(5)
				})
			),
			new TagNumRule(new Tag("Fizz"), new DivCondition(3)),
			new TagNumRule(new Tag("Buzz"), new DivCondition(5))
		});

		NumberGenerator numberGenerator = new RangeNumberGenerator(1, 100);

		new RulesRunner(rules, numberGenerator, new ConsolePrinter()).run();
	}

	private static void optimizedSolve() {
		boolean changed;
		for (int i = 1; i <= max; i++) {
			changed = false;
			if (i % 3 == 0) {
				System.out.print("Fizz");
				changed = true;
			}
			if (i % 5 == 0) {
				System.out.print("Buzz");
				changed = true;
			}
			System.out.println(changed ? "" : i);
		}
	}

	private static void simpleSolve() {
		String tag;
		for (int i = 1; i <= max; i++) {
			tag = (i % 3 == 0 ? "Fizz" : "") + (i % 5 == 0 ? "Buzz" : "");
			System.out.println(tag.isEmpty() ? i : tag);
		}
	}

	public static void main(String[] args) {
		long time = -System.currentTimeMillis();
		oopSolve();
		time += System.currentTimeMillis();
		System.out.println("oopSolve time: " + time);

		time = -System.currentTimeMillis();
		optimizedSolve();
		time += System.currentTimeMillis();
		System.out.println("optimizedSolve time: " + time);

		time = -System.currentTimeMillis();
		simpleSolve();
		time += System.currentTimeMillis();
		System.out.println("simpleSolve time: " + time);
	}
}
