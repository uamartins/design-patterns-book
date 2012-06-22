package edu.dpb.ch24.i04.exercises.ex04.mailinglist.aspects;

import java.util.Date;
import java.util.HashMap;
import java.util.Set;

public class MessageBox extends Subject {
	private String from;
	private String subject;
	private Date date;
	private String body;

	public MessageBox() {
		role2observers = new HashMap<Role, Set<Observer>>();
	}

	public void setMessage(Role role, String from, String subject, Date date,
			String body) {
		this.from = from;
		this.subject = subject;
		this.date = date;
		this.body = body;
		// Automatic notification after Subject's state is changed.
		notifyObservers(role);
	}

	public String getFrom() {
		return from;
	}

	public String getSubject() {
		return subject;
	}

	public Date getDate() {
		return date;
	}

	public String getBody() {
		return body;
	}
}
