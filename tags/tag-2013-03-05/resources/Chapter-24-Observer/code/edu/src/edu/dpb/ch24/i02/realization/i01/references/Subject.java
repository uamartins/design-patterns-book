package edu.dpb.ch24.i02.realization.i01.references;

import java.util.Set;

//public abstract class Subject {
//	Observer observer1;
//	// ...
//	Observer observerN;
//	// What will happen if observer N+1 asks for a registration?
//	// ...
//}

public abstract class Subject {
	Set<Observer> observers;
	// When observer N+1 asks for a registration,
	// it will be easily added to the collection.
	// ...
}