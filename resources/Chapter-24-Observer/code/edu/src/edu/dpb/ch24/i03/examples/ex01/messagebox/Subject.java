package edu.dpb.ch24.i03.examples.ex01.messagebox;
import java.util.Set;

public abstract class Subject {
	// 'Set' collection is used for mapping 'subject-to-observers'.
	protected Set<Observer> observers;

	public void register(Observer observer) {
		observers.add(observer);
		System.out.println("[Subject] Registered " + observer + ".");
	}

	public void unregister(Observer observer) {
		observers.remove(observer);
		System.out.println("[Subject] Unregistered " + observer + ".");
	}

	public void notifyObservers() {
		System.out.println("[Subject] Notify all observers.");
		for (Observer observer : observers) {
			observer.update();
		}
	}
}
