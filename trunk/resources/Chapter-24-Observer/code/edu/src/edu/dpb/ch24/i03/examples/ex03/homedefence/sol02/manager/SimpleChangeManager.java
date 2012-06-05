package edu.dpb.ch24.i03.examples.ex03.homedefence.sol02.manager;

import java.util.Map;
import java.util.Set;

import edu.dpb.ch24.i03.examples.ex03.homedefence.sol02.ChangeManager;
import edu.dpb.ch24.i03.examples.ex03.homedefence.sol02.Incident;
import edu.dpb.ch24.i03.examples.ex03.homedefence.sol02.Observer;
import edu.dpb.ch24.i03.examples.ex03.homedefence.sol02.Subject;

public class SimpleChangeManager extends ChangeManager {
	// Singleton pattern used
	private static SimpleChangeManager instance;

	private SimpleChangeManager() {
		super();
	}

	public static SimpleChangeManager getInstance() {
		if (instance == null) {
			instance = new SimpleChangeManager();
		}
		return instance;
	}

	@Override
	public void notifyObservers(Incident incident) {
		for (Map.Entry<Subject, Set<Observer>> s2oEntry : subject2observers
				.entrySet()) {
			Set<Observer> observers = s2oEntry.getValue();
			if (observers != null) {
				for (Observer observer : observers) {
					observer.update(incident);
				}
			}
		}
	}
}
