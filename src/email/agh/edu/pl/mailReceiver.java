package email.agh.edu.pl;

import java.io.IOException;

public class mailReceiver {
	private IMAPConnection conn; 
	
	public mailReceiver(String serverName, int serverPort, String login, String password) throws IOException {
		this.conn = new IMAPConnection(serverName, serverPort, login, password);
	}
	
	public String getMailboxes() throws IOException, InterruptedException {
		conn.beginConnection();
		String response;
		conn.writetoServer("1 LIST \"\" *");
		response = conn.readResponse();
		conn.closeConnection();
		return response;
	}
	
	public String getMailSubjects(String mailbox) throws IOException, InterruptedException {
		conn.beginConnection();
		String response;
		conn.writetoServer("1 SELECT " + mailbox);
		response = conn.readResponse();
		conn.writetoServer("1 FETCH 1:* (BODY[HEADER.FIELDS (SUBJECT)])");
		response = conn.readResponse();
		conn.closeConnection();
		return response;
	}
	
	public Mail getEmail(String mailbox, long id) throws IOException, InterruptedException {
		conn.beginConnection();
		String response;
		conn.writetoServer("1 SELECT " + mailbox);
		conn.writetoServer("1 FETCH " + id + " RFC822");
		response = conn.readResponse();
		Mail mail = new Mail(id, response);
		mail.decodeMail();
		return mail;
	}
}
