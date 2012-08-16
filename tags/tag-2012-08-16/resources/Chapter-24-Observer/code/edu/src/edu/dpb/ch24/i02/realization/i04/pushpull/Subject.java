package edu.dpb.ch24.i02.realization.i04.pushpull;

import java.util.List;

public abstract class Subject {
	List<Observer> observers;
	public abstract void notifyObservers();
}
