package edu.dpb.ch24.i03.examples.ex01.messagebox;
import java.util.Date;

public class MainClass {

	public static void main(String[] args) {
		// 1. create observable object
		MessageBox messageBox = new MessageBox();

		// 2. create observers
		SMSUser smsUser = new SMSUser(messageBox);
		EmailUser emailUser = new EmailUser(messageBox);

		// 3. register observers
		messageBox.register(emailUser);
		messageBox.register(smsUser);
		System.out.println(DELIMITER);

		// 4. create sender
		UniversityAdministration uniAdmin = new UniversityAdministration(
				messageBox);
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

	// Constants
	private static final String FROM = "University Administration";
	private static final String MESSAGE_01_SUBJECT = "The lecture this week "
			+ "will be canceled.";
	private static final String MESSAGE_01_BODY = "The lecture this week "
			+ "will be canceled due to illness of Professor Smith. "
			+ "We apologize for the inconvenience.";
	private static final String MESSAGE_02_SUBJECT = "Happy Day of Slavonic alphabet!";
	private static final String DELIMITER = "=================================\n";
}
