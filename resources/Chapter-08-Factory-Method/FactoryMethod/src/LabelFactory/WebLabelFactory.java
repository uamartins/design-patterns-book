package LabelFactory;

public class WebLabelFactory extends LabelFactory {
	public @Override
	Label createLabel() {
		return new WebLabel();
	}
}