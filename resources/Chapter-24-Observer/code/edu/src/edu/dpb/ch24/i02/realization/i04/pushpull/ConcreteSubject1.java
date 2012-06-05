package edu.dpb.ch24.i02.realization.i04.pushpull;


public class ConcreteSubject1 extends Subject {

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(this);
		}
		// ...
	}
	// ...
}
