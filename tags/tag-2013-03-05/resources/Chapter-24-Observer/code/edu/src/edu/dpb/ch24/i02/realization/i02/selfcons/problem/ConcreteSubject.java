package edu.dpb.ch24.i02.realization.i02.selfcons.problem;

public class ConcreteSubject extends Subject {
	double discount;

	@Override
	public void setPrice(double newPrice) {
		// set state and trigger notification
		super.setPrice(newPrice);
		// late update of subclass's state
		// because it is after notification
		this.discount = calculateDiscount(newPrice);
	}

	private double calculateDiscount(double newPrice) {
		double result = 0d;
		// do calculation...
		return result;
	}
	// ...
}
