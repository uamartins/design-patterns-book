package edu.dpb.ch24.i03.examples.ex01.mailinglist;

import java.util.Date;
import java.util.HashSet;

public class MailingList extends Subject {
	private String from;
	private String subject;
	private Date date;
	private String body;

	public MailingList() {
		observers = new HashSet<Observer>();
	}

	public void setMessage(String from, String subject, Date date, String body) {
		this.from = from;
		this.subject = subject;
		this.date = date;
		this.body = body;
		// Automatic notification after Subject's state is changed.
		notifyObservers();
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
