package email.agh.edu.pl;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class UiManager {


    public void buildUI() throws IOException, InterruptedException {
        boolean condition = true;
        while (condition){
            System.out.println("MAIL CLIENT");
            System.out.println("Wyślij pocztę, wpisz: 1");
            System.out.println("Odbierz pocztę, wpisz: 2");
            System.out.println("Wyjście, wpisz: 3");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    buildMail();
                    break;
                case 2:
                    break;
                case 3:
                    condition = false;
                    break;
                default:
                    System.out.println("Wybrano nieznane polecenie");
                    break;
            }
        }

        System.out.println("Zamykam...");
        Thread.sleep(500);
        System.exit(0);
    }
    private void buildMail() throws IOException, InterruptedException {
        String condition = "t";
        Mail mail = new Mail(1);
        MailSender ms = new MailSender("smtp.poczta.onet.pl", 587, "test.ask@onet.pl", "AskAgh1", mail);
        Scanner scanner = new Scanner(System.in);
        mail.setSender("test.ask@onet.pl");
        while(condition.equals("t")) {
            System.out.println("Podaj swoje imię: ");
            mail.setSenderName(scanner.nextLine());
            System.out.println("Podaj odbiorcę: ");
            mail.setRecipient(scanner.nextLine());
            System.out.println("Podaj odbiorcę CC: ");
            mail.setCcRecipent(scanner.nextLine());
            System.out.println("Podaj odbiorcę BCC: ");
            mail.setBccRecipent(scanner.nextLine());
            System.out.println("Podaj temat: ");
            mail.setSubject(scanner.nextLine());
            System.out.println("Wpisz treść: ");
            mail.setText(scanner.nextLine());
            System.out.println("Dodać załącznik(t/n)?");
            if (scanner.nextLine().equals("t")) {
                System.out.println("Podaj nazwę załącznika");
                File attach = new File(scanner.nextLine());
                mail.setAttachment(attach);
            }
            System.out.println("Chcesz edytować?(t/n)");
            condition = scanner.nextLine();
        }
        System.out.println("Wysyłam maila do "+ mail.getRecipient()+ " "+ mail.getCcRecipent()+ " " + mail.getBccRecipent());
        ms.sendMail();
        }

        private void readMail(){

        }

}
