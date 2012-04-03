public class Apple {
	public void washOut() {
		System.out.println("Washing The Apple.");
	}

	public void peelOffApple() {
		System.out.println("Peeling This Apple Off.");
	}

	public void chop() {
		System.out.println("Chopping The Apple.");
	}

	public void eat() {
		System.out.println("Finally Eating The Apple!");
	}

	public void consume() {
		washOut();
		peelOffApple();
		chop();
		eat();
	}
}
