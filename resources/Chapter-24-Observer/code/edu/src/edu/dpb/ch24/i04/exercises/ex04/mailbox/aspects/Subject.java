package edu.dpb.ch24.i04.exercises.ex04.mailbox.aspects;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class Subject {
	protected Map<Role, Set<Observer>> role2observers;

	public void register(Observer observer, Role... roles) {
		if (roles == null) {
			return;
		}
		for (Role role : roles) {
			Set<Observer> observers = role2observers.get(role);
			if (observers == null) {
				observers = new HashSet<Observer>();
				observers.add(observer);
				role2observers.put(role, observers);
			} else {
				observers.add(observer);
			}
			System.out.println("[Subject] Registered " + observer
					+ " to listen for messages from " + role + ".");
		}

	}

	public void unregister(Observer observer, Role... roles) {
		if (roles == null) {
			return;
		}
		for (Role role : roles) {
			Set<Observer> observers = role2observers.get(role);
			if (observers != null) {
				observers.remove(observer);
			}
			if (observers.isEmpty()) {
				role2observers.remove(role);
			}
			System.out.println("[Subject] Unregistered " + observer
					+ " to listen for messages from " + role + ".");
		}
	}

	public void notifyObservers(Role role) {
		System.out.println("[Subject] Notify all observers "
				+ "for new message from " + role + ".");

		Set<Observer> observers = role2observers.get(role);
		if (observers != null) {
			for (Observer observer : observers) {
				observer.update();
			}
		}
	}
}
