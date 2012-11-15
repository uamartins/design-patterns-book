package edu.dpb.ch24.i02.realization.i03.aspects;

public interface Subject {

	public void register(Observer observer, Aspect interest);
	
	
	public void update(Aspect interest);
	
}
