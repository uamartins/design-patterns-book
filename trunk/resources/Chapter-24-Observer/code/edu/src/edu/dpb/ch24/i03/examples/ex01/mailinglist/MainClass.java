package edu.dpb.ch24.i03.examples.ex01.mailinglist;

import java.util.Date;

public class MainClass {
	// Constants
	private static final String FROM = "University Administration";
	private static final String MESSAGE_01_SUBJECT = "The lecture this week "
			+ "will be canceled.";
	private static final String MESSAGE_01_BODY = "The lecture this week "
			+ "will be canceled due to illness of Professor Smith. "
			+ "We apologize for the inconvenience.";
	private static final String MESSAGE_02_SUBJECT = "Happy Day of Slavonic alphabet!";
	private static final String DELIMITER = "=================================\n";

	public static void main(String[] args) {
		// 1. create observable object
		MailingList mailingList = new MailingList();

		// 2. create observers
		SMSUser smsUser = new SMSUser(mailingList);
		EmailUser emailUser = new EmailUser(mailingList);

		// 3. register observers
		mailingList.register(emailUser);
		mailingList.register(smsUser);
		System.out.println(DELIMITER);

		// 4. create sender
		UniversityAdministration uniAdmin = new UniversityAdministration(
				mailingList);
		// 5. send message
		uniAdmin.sendMessage(FROM, MESSAGE_01_SUBJECT, new Date(),
				MESSAGE_01_BODY);
		System.out.println(DELIMITER);

		// 6. unregister observer (pay attention to 'call back')
		Subject subject = emailUser.getSubject();
		subject.unregister(emailUser);
		System.out.println(DELIMITER);

		// 7. send another message
		uniAdmin.sendMessage(FROM, MESSAGE_02_SUBJECT, new Date(), null);

	}
}
