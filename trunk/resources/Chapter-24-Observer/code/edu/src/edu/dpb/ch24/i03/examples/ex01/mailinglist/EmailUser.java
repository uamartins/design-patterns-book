package edu.dpb.ch24.i03.examples.ex01.mailinglist;

import java.util.Date;

public class EmailUser implements Observer {
	// callback
	private MailingList mailingList;

	public EmailUser(MailingList mailingList) {
		this.mailingList = mailingList;
	}

	@Override
	public void update() {
		String from = mailingList.getFrom();
		String subject = mailingList.getSubject();
		Date date = mailingList.getDate();
		String body = mailingList.getBody();

		System.out.println("[EmailUser] Received Email message:\n\tFROM: "
				+ from + "\n\tSUBJECT: " + subject + "\n\tDATE: " + date
				+ "\n\tBODY: " + body + "\n");
	}

	@Override
	public Subject getSubject() {
		return mailingList;
	}

	@Override
	public String toString() {
		return "EmailUser";
	}

}
