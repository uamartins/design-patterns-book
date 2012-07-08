public class Apple extends Fruit {
	@Override
	public void prepareToPeel() {
		System.out.println("Washing The Apple.");
	}

	@Override
	public void processAfterPeel() {
		System.out.println("Chopping The Apple.");
	}
}
