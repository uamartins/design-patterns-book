package edu.dpb.ch24.i03.examples.ex01.mailinglist;

import java.util.Date;

public class UniversityAdministration {
	private MailingList mailingList;

	public UniversityAdministration(MailingList mailingList) {
		this.mailingList = mailingList;
	}

	public void sendMessage(String from, String subject, Date date, String body) {
		mailingList.setMessage(from, subject, date, body);
	}
}
