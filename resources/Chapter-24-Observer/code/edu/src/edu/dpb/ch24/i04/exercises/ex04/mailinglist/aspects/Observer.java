package edu.dpb.ch24.i04.exercises.ex04.mailinglist.aspects;

public interface Observer {
	// This method has no parameters since 'pull' model is used.
	public void update();

	public Subject getSubject();
}
