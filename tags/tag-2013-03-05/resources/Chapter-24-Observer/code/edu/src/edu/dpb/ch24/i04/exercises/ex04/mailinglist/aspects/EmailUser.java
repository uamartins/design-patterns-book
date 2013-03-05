package edu.dpb.ch24.i04.exercises.ex04.mailinglist.aspects;

import java.util.Date;

public class EmailUser implements Observer {
	// callback
	private MailingList mailingList;
	private Role role;

	public EmailUser(MailingList mailingList, Role role) {
		this.mailingList = mailingList;
		this.role = role;
	}

	public Role getRole() {
		return role;
	}

	@Override
	public void update() {
		String from = mailingList.getFrom();
		String subject = mailingList.getSubject();
		Date date = mailingList.getDate();
		String body = mailingList.getBody();

		String message = String
				.format("[%s][EmailUser] Received Email message:\n\tFROM: %s\n\tSUBJECT: %s\n\tDATE: %s\n\tBODY: %s\n",
						role.toString(), from, subject, date.toString(), body);
		System.out.println(message);
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
