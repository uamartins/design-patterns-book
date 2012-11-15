public class Apple extends Fruit {
	
	private int mSerialNumber;
	private static int sNumberOfApples = 0;

	public Apple(int weight) {
		setWeight(weight);
		++sNumberOfApples;
		this.mSerialNumber = sNumberOfApples;
	}

	/**
	 * @return the mSerialNumber
	 */
	public int getSerialNumber() {
		return mSerialNumber;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see Fruit#prepareToPeel()
	 */
	@Override
	public void prepareToPeel() {
		System.out.println("Washing The Apple.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Fruit#processAfterPeel()
	 */
	@Override
	public void processAfterPeel() {
		System.out.println("Chopping The Apple.");
	}

	@Override
	public int compareTo(Fruit otherFruit) {
		int result = -1;
		if (otherFruit instanceof Apple) {
			Apple otherApple = (Apple)otherFruit;
			if (this.getSerialNumber() == otherApple.getSerialNumber()) {
				result = 0;
			} else if (this.getSerialNumber() < otherApple.getSerialNumber())
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
