package edu.dpb.ch24.i03.examples.ex03.homedefence.sol01;

import java.util.Set;

public abstract class Subject {
	protected Set<Observer> observers;

	public void register(Observer observer) {
		observers.add(observer);
	}

	public void unregister(Observer observer) {
			observers.remove(observer);
	}

	public abstract void notifyObservers(); 
}
