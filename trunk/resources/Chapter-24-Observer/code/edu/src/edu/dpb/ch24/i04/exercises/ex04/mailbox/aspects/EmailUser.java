package edu.dpb.ch24.i04.exercises.ex04.mailbox.aspects;

import java.util.Date;

public class EmailUser implements Observer {
	// callback
	private MessageBox messageBox;
	private Role role;

	public EmailUser(MessageBox messageBox, Role role) {
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
		String body = messageBox.getBody();

		System.out.println("[" + role
				+ "][EmailUser] Received Email message:\n\tFROM: " + from
				+ "\n\tSUBJECT: " + subject + "\n\tDATE: " + date
				+ "\n\tBODY: " + body + "\n");
	}

	@Override
	public Subject getSubject() {
		return messageBox;
	}

	@Override
	public String toString() {
		return "EmailUser";
	}

}
