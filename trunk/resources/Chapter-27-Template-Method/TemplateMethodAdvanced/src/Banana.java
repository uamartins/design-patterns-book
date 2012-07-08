public class Banana extends Fruit{
	@Override
	public void prepareToPeel() {
		System.out.println("Determining The End To Peel Off From.");
	}

	@Override
	public void processAfterPeel() {
        System.out.println("Peeling This Banana's Strokes Off.");	
	}
}
