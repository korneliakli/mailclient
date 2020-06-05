package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Base64;
import java.util.regex.*;



import java.io.PrintWriter;

public class test_smtp {
	
	 private static String readResponse(BufferedReader in) throws IOException, InterruptedException {
	        StringBuilder sb = new StringBuilder();
	        sb.append(in.readLine()); // wait and read first line
	        Thread.sleep(100);
	        while(in.ready())
	            sb.append("\n").append(in.readLine());
	        Thread.sleep(100);
	        return sb.toString();
	    }
	 
	/*
	 * public static void main(String args[]) throws IOException,
	 * InterruptedException { int server_port = 143; String server_name =
	 * "imap.poczta.onet.pl"; String response; System.out.println("Hello"); Socket
	 * socket = new Socket(server_name, server_port); PrintWriter pw = new
	 * PrintWriter(socket.getOutputStream(), true); BufferedReader in = new
	 * BufferedReader(new InputStreamReader(socket.getInputStream())); String login
	 * = "test.ask@onet.pl"; String pass = "AskAgh1";
	 * 
	 * String MIME = "MIME-Version: 1.0\n"; String MIME_BOUNDARY_PLAIN =
	 * "MIME_BOUNDARY"; String MIME_BOUNDARY = "--" + MIME_BOUNDARY_PLAIN + "\n";
	 * String CONTENT_TYPE_MULTIPART = "Content-Type: multipart/mixed; boundary=\""
	 * + MIME_BOUNDARY_PLAIN + "\"\n\n"; String
	 * CONTENT_TRANSFER_ENCODING="Content-Transfer-Encoding: 8bit\n"; String
	 * CONTENT_TYPE_TEXT = "Content-Type: text/html;\n\n";
	 * 
	 * String ATTACHMENT_CONTENT_TYPE = "Content-Type: image/png; name=\"%s\"\n"; //
	 * TODO extension String ATTACHMENT_CONTENT_DESCRIPTION =
	 * "Content-Description: %s\n"; String ATTACHMENT_CONTENT_DISPOSITION =
	 * "Content-Disposition: attachment; filename=\"%s\"\n"; String
	 * ATTACHMENT_CONTENT_ENCODING = "Content-Transfer-Encoding: BASE64\n\n";
	 * 
	 * String END_OF_DATA = "\n.\n";
	 * 
	 * PrintWriter pwf = new PrintWriter("mail.txt"); pw.println("1 LOGIN " + login
	 * + " " + pass); response = readResponse(in); System.out.println(response);
	 */
		/*
		 * response = readResponse(in); System.out.println(response);
		 */
		/*pw.println("1 SELECT \"INBOX\"");
		response = readResponse(in);
		System.out.println(response);
		
		
		pw.println("1 fetch 2 RFC822");
		response = readResponse(in);
		
		Pattern pat = Pattern.compile("<html>");
		Matcher matcher = pat.matcher(response);
		String html = response.substring(response.indexOf("<html>"), response.indexOf("</html>"));
		System.out.print(html);
		Document doc = Jsoup.parse(html);
		
		pwf.print(response);*/
		/*
		 * pw.println("1 FETCH 1:* (BODY[HEADER.FIELDS (SUBJECT)])"); response =
		 * readResponse(in); System.out.println(response);
		 */
		/*
		 * pw.println("AUTH LOGIN"); response = readResponse(in);
		 * System.out.println("auth " + response);
		 * pw.println(Base64.getEncoder().encodeToString(login.getBytes())); response =
		 * readResponse(in); System.out.println("login " + response);
		 * pw.println(Base64.getEncoder().encodeToString(pass.getBytes())); String
		 * response2 = readResponse(in); System.out.println("r2" + response2);
		 * pw.println("MAIL FROM:<aleksanderklis@poczta.onet.pl>"); response2 =
		 * readResponse(in); System.out.println("r2" + response2);
		 * pw.println("RCPT TO:<korneliakli@gmail.com>"); response2 = readResponse(in);
		 * System.out.println("r3" + response2); response2 = readResponse(in);
		 * System.out.println("r4" + response2);
		 */
	/*
	 * socket.close(); }
	 */
}

