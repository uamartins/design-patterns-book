package edu.dpb.ch24.i03.examples.ex03.homedefence.sol02.manager;

import java.util.Set;

import edu.dpb.ch24.i03.examples.ex03.homedefence.sol02.ChangeManager;
import edu.dpb.ch24.i03.examples.ex03.homedefence.sol02.Incident;
import edu.dpb.ch24.i03.examples.ex03.homedefence.sol02.Observer;
import edu.dpb.ch24.i03.examples.ex03.homedefence.sol02.Subject;

public class DAGChangeManager extends ChangeManager {
	// Singleton pattern used
	private static DAGChangeManager instance;

	private DAGChangeManager() {
		super();
	}

	public static DAGChangeManager getInstance() {
		if (instance == null) {
			instance = new DAGChangeManager();
		}
		return instance;
	}
	
	@Override
	public void notifyObservers(Incident incident) {
		Subject subject = incident.getSensor(); // upcasting
		Set<Observer> observers = subject2observers.get(subject);
		if (observers != null) {
			for (Observer observer : observers) {
				observer.update(incident);
			}
		}

	}
}
