package edu.dpb.ch24.i04.exercises.ex04.mailinglist.aspects;

import java.util.Date;

public class MainClass {
	private static final String DELIMITER = "=================================\n";

	public static void main(String[] args) {
		// 1. create observable object
		MailingList mailingList = new MailingList();

		// 2. create observers
		SMSUser student = new SMSUser(mailingList, Role.STUDENT);
		EmailUser assistant = new EmailUser(mailingList, Role.ASSISTANT);
		EmailUser lecturer = new EmailUser(mailingList, Role.LECTURER);

		// 3.1 register subscribers
		mailingList.register(assistant, Role.STUDENT, Role.ADMINISTRATION,
				Role.LECTURER);
		mailingList.register(student, Role.ASSISTANT, Role.ADMINISTRATION);
		mailingList.register(lecturer, Role.ASSISTANT, Role.ADMINISTRATION);
		System.out.println(DELIMITER);

		// 4. create sender
		UniversityAdministration uniAdmin = new UniversityAdministration(
				mailingList);
		// 5.1 uniAdmin send message
		// uniAdmin.sendMessage("UniAdmin", "AdminMsg-1", new Date(),
		// "AdminMsgBody-1");
		// System.out.println(DELIMITER);

		// 6. unregister assistent from student's messages
		mailingList.unregister(assistant, Role.STUDENT);
		System.out.println(DELIMITER);

		// 7. send another message
		uniAdmin.sendMessage("UniAdmin", "AdminMsg-2", new Date(), null);

		// 7. assistent sends message
		// mailingList.setMessage(assistant.getRole(), "Assist", "AssistMsg",
		//		new Date(), "AssistMsgBody");

	}
}
