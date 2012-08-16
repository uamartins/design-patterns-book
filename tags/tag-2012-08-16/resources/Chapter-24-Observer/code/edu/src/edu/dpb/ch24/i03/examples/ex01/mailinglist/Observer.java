package edu.dpb.ch24.i03.examples.ex01.mailinglist;

public interface Observer {
	// This method has no parameters since 'pull' model is used.
	public void update();

	public Subject getSubject();
}
