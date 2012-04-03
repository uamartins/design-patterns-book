
public abstract class Fruit {
	
	public abstract void prepareToPeel();

	public void peelOff() {
		System.out.println("Peeling This Fruit Off.");
	}

	public abstract void processAfterPeel();

	public void eat() {
		prepareToPeel();
		peelOff();
		processAfterPeel();
		
		System.out.println("Finally Eating The Apple!");
	}
}