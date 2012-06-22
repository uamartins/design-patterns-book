package edu.dpb.ch24.i04.exercises.ex04.mailinglist.aspects;

import java.util.Date;

public class SMSUser implements Observer {
	// callback
	MailingList mailingList;
	private Role role;

	public SMSUser(MailingList mailingList, Role role) {
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

		String message = String
				.format("[%s][SMSUser] Received SMS message:\n\tFROM: %s\n\tSUBJECT: %s\n\tDATE: %s\n",
						role.toString(), from, subject, date.toString());
		System.out.println(message);
	}

	@Override
	public Subject getSubject() {
		return mailingList;
	}

	@Override
	public String toString() {
		return "SMSUser";
	}

}
