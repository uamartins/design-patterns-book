package LabelFactory;

public class GenericLabelFactory<T> {
	Class<T> c;

	public static <T> GenericLabelFactory<T> create(Class<T> c) {
		return new GenericLabelFactory<T>(c);
	}

	public GenericLabelFactory(Class<T> c) {
		super();
		this.c = c;
	}

	public T createLabel() throws InstantiationException,
			IllegalAccessException {
		return c.newInstance();
	}
}
