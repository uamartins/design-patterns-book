/**
 * 
 */

/**
 * @author I056723
 * 
 */
public class Apple extends Fruit {

	/*
	 * (non-Javadoc)
	 * 
	 * @see EatFruit#prepareFruitToPeel()
	 */
	@Override
	public void prepareToPeel() {
		System.out.println("Washing The Apple.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see EatFruit#processFruitAfterPeel()
	 */
	@Override
	public void processAfterPeel() {
		System.out.println("Chopping The Apple.");
	}

}
