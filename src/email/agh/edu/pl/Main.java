package email.agh.edu.pl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
	public static void main(String args[]) throws IOException, InterruptedException {
		Mail mail = new Mail(1);
		File attach = new File("grumpy.png");
		mail.setAttachment(attach);
		mail.setSender("test.ask@onet.pl");
		mail.setRecipient("korneliakli@gmail.com");
		mail.setSubject("Kotek");
		mail.setText("zalacznik");
		mail.setSenderName("Test ASK");
		
		mailSender ms = new mailSender("smtp.poczta.onet.pl", 587, "test.ask@onet.pl", "AskAgh1", mail);
		
		//ms.sendMail(); 
		
		mailReceiver mr = new mailReceiver("imap.poczta.onet.pl", 143, "test.ask@onet.pl", "AskAgh1");
		Mail mail1 = mr.getEmail("INBOX", 1);
		System.out.println(mail1.getEncodedMail());
		
	}
}
