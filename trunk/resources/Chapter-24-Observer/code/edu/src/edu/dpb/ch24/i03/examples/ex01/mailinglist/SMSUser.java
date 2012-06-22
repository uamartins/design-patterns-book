package edu.dpb.ch24.i03.examples.ex01.mailinglist;

import java.util.Date;

public class SMSUser implements Observer {
	// callback
	MailingList mailingList;

	public SMSUser(MailingList mailingList) {
		this.mailingList = mailingList;
	}

	@Override
	public void update() {
		String from = mailingList.getFrom();
		String subject = mailingList.getSubject();
		Date date = mailingList.getDate();

		String message = String
				.format("[SMSUser] Received SMS message:\n\tFROM: %s\n\tSUBJECT: %s\n\tDATE: %s\n",
						from, subject, date);
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
