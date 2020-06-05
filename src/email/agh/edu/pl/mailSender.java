package email.agh.edu.pl;

import java.io.IOException;

public class mailSender {
	private Mail mail;
	private SMTPConnection conn;
	
	public mailSender(String serverName, int serverPort, String login, String password, Mail mail) throws IOException {
		this.mail = mail;
		this.conn = new SMTPConnection(serverName, serverPort, login, password);
	}
	
	public void sendMail() throws IOException, InterruptedException {
		mail.buildMail();
		conn.beginConnection();
		conn.writetoServer("MAIL FROM:<" + mail.getSender() + ">");
		System.out.println(conn.readResponse());
		conn.writetoServer("RCPT TO:<" + mail.getRecipient() + ">");
		System.out.println(conn.readResponse());
		conn.writetoServer("DATA");
		System.out.println(conn.readResponse());
		conn.writetoServer(mail.getEncoded());
		conn.writetoServer(".");
		System.out.println(conn.readResponse());
		conn.writetoServer("QUIT");
		System.out.println(conn.readResponse());
	}
}
