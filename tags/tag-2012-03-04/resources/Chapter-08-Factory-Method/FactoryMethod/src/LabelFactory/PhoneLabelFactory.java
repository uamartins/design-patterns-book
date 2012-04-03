package LabelFactory;

public class PhoneLabelFactory extends LabelFactory {
	public @Override
	Label createLabel() {
		return new PhoneLabel();
	}
}
