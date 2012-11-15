package edu.dpb.ch24.i04.exercises.ex04.mailinglist.aspects;

import java.util.Date;

public class UniversityAdministration {
	private MailingList mailingList;
	private Role role;

	public UniversityAdministration(MailingList mailingList) {
		this.mailingList = mailingList;
		role = Role.ADMINISTRATION;
	}

	public void sendMessage(String from, String subject, Date date, String body) {
		mailingList.setMessage(role, from, subject, date, body);
	}

	public Role getRole() {
		return role;
	}

}
