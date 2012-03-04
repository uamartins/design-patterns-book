/**
 * 
 */

/**
 * @author I056723
 * 
 */
public class Banana extends Fruit {

	/*
	 * (non-Javadoc)
	 * 
	 * @see EatFruit#prepareFruitToPeel()
	 */
	@Override
	public void prepareToPeel() {
		System.out.println("Determing The End To Peel Off From.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see EatFruit#processFruitAfterPeel()
	 */
	@Override
	public void processAfterPeel() {
		System.out.println("Peeling This Banana's Strokes Off.");
	}

}
