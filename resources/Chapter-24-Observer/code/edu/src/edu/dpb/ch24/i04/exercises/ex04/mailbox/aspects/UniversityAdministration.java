package edu.dpb.ch24.i04.exercises.ex04.mailbox.aspects;

import java.util.Date;

public class UniversityAdministration {
	private MessageBox messageBox;
	private Role role;

	public UniversityAdministration(MessageBox messageBox) {
		this.messageBox = messageBox;
		role = Role.ADMINISTRATION;
	}

	public void sendMessage(String from, String subject, Date date, String body) {
		messageBox.setMessage(role, from, subject, date, body);
	}

	public Role getRole() {
		return role;
	}

}
