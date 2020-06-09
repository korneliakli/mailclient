package email.agh.edu.pl;

import java.io.File;
import java.io.IOException;

public class Main {
	public static void main(String args[]) throws IOException, InterruptedException {
		UiManager manager= new UiManager();
		manager.buildUI();
//		Mail mail = new Mail(1);
//		File attach = new File("grumpy.png");
//		mail.setAttachment(attach);
//		mail.setSender("test.ask@onet.pl");
//		mail.setRecipient("czech@agh.edu.pl");
//		mail.setSubject("mail with extra");
//		mail.setText("zalacznik");
//		mail.setSenderName("Artur");
//
//		MailSender ms = new MailSender("smtp.poczta.onet.pl", 587, "test.ask@onet.pl", "AskAgh1", mail);
		
		//ms.sendMail();

		
//		MailReceiver mr = new MailReceiver("imap.poczta.onet.pl", 143, "test.ask@onet.pl", "AskAgh1");
//		//System.out.println(mr.getMailboxes());
//		//System.out.println(mr.getMailSubjects("INBOX"));
//		Mail mail1 = mr.getEmail("INBOX", 1);
//		System.out.println(mail1.getEncodedMail());
		
	}
}
