package edu.dpb.ch24.i03.examples.ex03.homedefence.sol02;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class ChangeManager {
	protected Map<Subject, Set<Observer>> subject2observers;

	protected ChangeManager() {
		subject2observers = new HashMap<Subject, Set<Observer>>();
	}

	public void register(Subject subject, Observer observer) {
		Set<Observer> observers = subject2observers.get(subject);
		if (observers == null) {
			observers = new HashSet<Observer>();
			observers.add(observer);
			subject2observers.put(subject, observers);
		} else {
			observers.add(observer);
		}
	}

	public void unregister(Subject subject, Observer observer) {
		Set<Observer> observers = subject2observers.get(subject);
		if (observers != null) {
			observers.remove(observer);
		}
		if (observers.isEmpty()) {
			subject2observers.remove(subject);
		}
	}

	public abstract void notifyObservers(Incident incident);
}
