package edu.dpb.ch24.i02.realization.i04.pushpull;

import java.util.Date;
import java.util.List;
import java.util.Map;

public abstract class Observer {
	List<Subject> subjects;

	public abstract void update(Subject subject);
	// ...
	
	public abstract void update(boolean arg01, int arg02, double arg03,
			String arg04, Date arg05);

	public abstract void update(Map args);

	public abstract void update(SubjectState subjectState);

}
