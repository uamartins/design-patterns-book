package bg.designpatternsbook.interpreter;

import java.util.ArrayList;
import java.util.Iterator;

import bg.designpatternsbook.interpreter.context.Context;
import bg.designpatternsbook.interpreter.expression.Expression;
import bg.designpatternsbook.interpreter.expression.HundredExpression;
import bg.designpatternsbook.interpreter.expression.OneExpression;
import bg.designpatternsbook.interpreter.expression.TenExpression;
import bg.designpatternsbook.interpreter.expression.ThousandExpression;

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String roman = "MCMXXVIII";
		Context context = new Context(roman);

		// Build the 'parse tree'
		ArrayList<Expression> tree = new ArrayList<Expression>();
		tree.add(new ThousandExpression());
		tree.add(new HundredExpression());
		tree.add(new TenExpression());
		tree.add(new OneExpression());

		// Interpret
		Iterator<Expression> iterator = tree.iterator();
		while (iterator.hasNext()) {
			Expression exp = iterator.next();
			exp.interpret(context);
		}
		System.out.println(roman + " = " + Integer.toString(context.getOutput()));
	}
}
