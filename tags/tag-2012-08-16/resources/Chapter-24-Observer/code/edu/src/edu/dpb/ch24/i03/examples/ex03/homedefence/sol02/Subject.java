package edu.dpb.ch24.i03.examples.ex03.homedefence.sol02;

public abstract class Subject {
	protected ChangeManager changeManager;

	public Subject(ChangeManager changeManager) {
		this.changeManager = changeManager;
	}

	public void attach(Observer observer) {
		changeManager.register(this, observer);
	}

	public void detach(Observer observer) {
		changeManager.unregister(this, observer);
	}

	public abstract void notifySubjectObservers();
}
