package beast.printer;

import beast.value.Label;

public class ConsolePrinter implements Printer {
	public void print(Label label) {
		System.out.println(label.getLabel());
	}
}
