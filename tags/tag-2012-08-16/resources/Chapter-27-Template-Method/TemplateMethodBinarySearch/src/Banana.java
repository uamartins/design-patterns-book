/**
 * @author I056723
 * 
 */
public class Banana extends Fruit {

	private int mLenght;

	public Banana(int weight, int length){
		setWeight(weight);
		setLenght(length);
	}
	/**
	 * @return the mLenght
	 */
	public int getLenght() {
		return mLenght;
	}

	/**
	 * @param mLenght
	 *            the mLenght to set
	 */
	public void setLenght(int mLenght) {
		this.mLenght = mLenght;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Fruit#prepareToPeel()
	 */
	@Override
	public void prepareToPeel() {
		System.out.println("Determing The End To Peel Off From.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Fruit#processAfterPeel()
	 */
	@Override
	public void processAfterPeel() {
		System.out.println("Peeling This Banana's Strokes Off.");
	}

	@Override
	public int compareTo(Fruit otherFruit) {
		int result = -1;
		if (otherFruit instanceof Banana) {
			Banana otherBanana = (Banana)otherFruit;
			if (this.getLenght() == otherBanana.getLenght()) {
				result = 0;
			} else if (this.getLenght() < otherBanana.getLenght())
				result = -1;
			else {
				result = 1;
			}
		} else {
			if (this.getWeight() == otherFruit.getWeight()) {
				result = 0;
			} else if (this.getWeight() < otherFruit.getWeight())
				result = -1;
			else {
				result = 1;
			}
		}
		return result;
	}

}
