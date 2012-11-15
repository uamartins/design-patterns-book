package edu.dpb.ch24.i02.realization.i02.selfcons.problem;

public abstract class Subject {
	protected double price;

	public void setPrice(double newPrice) {
		price = newPrice;
		notifyObservers();
	}

	// ...
	public void notifyObservers() {

	}
}
