import java.io.Console;
import java.util.Dictionary;

import LabelFactory.GenericLabelFactory;
import LabelFactory.PhoneLabel;
import ModuleFactory.Module;
import ModuleFactory.ShapesModuleFactory;

public class Main {

	/**
	 * @param args
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 */
	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException {
		// TODO Auto-generated method stub

		ShapesModuleFactory f = new ShapesModuleFactory();
		Module module = f.createModule();
		System.out.println(module.getClass().toString());

		GenericLabelFactory<PhoneLabel> factory = new GenericLabelFactory<PhoneLabel>(
				PhoneLabel.class);
		PhoneLabel label = factory.createLabel();
		System.out.println(label.getClass().toString());
	}
}
