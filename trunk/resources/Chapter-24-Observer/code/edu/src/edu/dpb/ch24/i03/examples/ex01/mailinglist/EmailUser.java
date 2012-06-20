package edu.dpb.ch24.i03.examples.ex01.mailinglist;

import java.util.Date;

public class EmailUser implements Observer {
	// callback
	private MessageBox messageBox;

	public EmailUser(MessageBox messageBox) {
		this.messageBox = messageBox;
	}

	@Override
	public void update() {
		String from = messageBox.getFrom();
		String subject = messageBox.getSubject();
		Date date = messageBox.getDate();
		String body = messageBox.getBody();

		System.out.println("[EmailUser] Received Email message:\n\tFROM: "
				+ from + "\n\tSUBJECT: " + subject + "\n\tDATE: " + date
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
