package edu.dpb.ch24.i03.examples.ex01.messagebox;

import java.util.Date;

public class UniversityAdministration {
	private MessageBox messageBox;

	public UniversityAdministration(MessageBox messageBox) {
		this.messageBox = messageBox;
	}

	public void sendMessage(String from, String subject, Date date, String body) {
		messageBox.setMessage(from, subject, date, body);
	}
}
