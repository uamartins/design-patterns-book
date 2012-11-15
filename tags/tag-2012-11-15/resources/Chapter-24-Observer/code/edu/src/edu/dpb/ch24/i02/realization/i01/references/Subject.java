package edu.dpb.ch24.i02.realization.i01.references;

import java.util.Set;

//public abstract class Subject {
//	Observer observer1;
//	// ...
//	Observer observerN;
//	// what will happen if observer N+1 ask for registration?
//	//...
//}

public abstract class Subject {
	Set<Observer> observers;
	// when observer N+1 ask for registration, 
	// it will be easily added to the collection.
	// ...
}