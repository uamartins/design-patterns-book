package edu.dpb.ch24.i03.examples.ex01.mailinglist;

import java.util.Date;

public class SMSUser implements Observer {
	// callback
	MessageBox messageBox;

	public SMSUser(MessageBox messageBox) {
		this.messageBox = messageBox;
	}

	@Override
	public void update() {
		String from = messageBox.getFrom();
		String subject = messageBox.getSubject();
		Date date = messageBox.getDate();

		System.out.println("[SMSUser] Received SMS message:\n\tFROM: " + from
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
