package edu.dpb.ch24.i04.exercises.ex04.mailbox.aspects;

import java.util.Date;

public class SMSUser implements Observer {
	// callback
	MessageBox messageBox;
	private Role role;

	public SMSUser(MessageBox messageBox, Role role) {
		this.messageBox = messageBox;
		this.role = role;
	}

	public Role getRole() {
		return role;
	}

	@Override
	public void update() {
		String from = messageBox.getFrom();
		String subject = messageBox.getSubject();
		Date date = messageBox.getDate();

		System.out.println("[" + role
				+ "][SMSUser] Received SMS message:\n\tFROM: " + from
				+ "\n\tSUBJECT: " + subject + "\n\tDATE: " + date + "\n");
	}

	@Override
	public Subject getSubject() {
		return messageBox;
	}

	@Override
	public String toString() {
		return "SMSUser";
	}

}
