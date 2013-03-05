package edu.dpb.ch24.i02.realization.i02.selfcons.solution;

public abstract class Subject {
	protected double price;

	public final void setPrice(double newPrice) {
		this.price = newPrice;
		calculateDiscount(newPrice);
		notifyObservers();
	}

	public abstract void calculateDiscount(double newPrice);

	// ...
	public void notifyObservers() {

	}
}
