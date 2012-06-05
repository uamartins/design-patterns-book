package edu.dpb.ch24.i02.realization.i04.pushpull;

import java.util.Date;
import java.util.Map;

public class ConcreteObserver extends Observer {
	@Override
	public void update(Subject subject) {
		if (subject instanceof ConcreteSubject1) {
			// process this case
		}
		if (subject instanceof ConcreteSubject2) {
			// process this case
		}
		// ....
	}

	// ...

	@Override
	public void update(SubjectState subjectState) {
		// ...

	}

	// ...

	@Override
	public void update(boolean arg01, int arg02, double arg03, String arg04,
			Date arg05) {
		// ...
	}

	// ...

	@SuppressWarnings("rawtypes")
	@Override
	public void update(Map changedFields) {
		// ...
	}

}
