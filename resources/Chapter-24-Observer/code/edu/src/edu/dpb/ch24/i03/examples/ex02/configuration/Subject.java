package edu.dpb.ch24.i03.examples.ex02.configuration;

import java.util.Set;

public abstract class Subject {
	Set<Observer> observers;

	public void register(Observer observer) {
		observers.add(observer);
		System.out.println("[Subject] Registered " + observer + ".");
	}

	public void unregister(Observer observer) {
		observers.remove(observer);
		System.out.println("[Subject] Unregistered " + observer + ".");
	}

	public abstract void notifyObservers(); 
}
