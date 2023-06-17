package com.example.attendance_back;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {

    public static void  send() {

        // Recipient's email ID needs to be mentioned.
        String to = "nicolai.nejintev@isa.utm.md";

        // Sender's email ID needs to be mentioned
        String from = "danielmunteanu907@gmail.com";

        // Assuming you are sending email from through gmails smtp
        String host = "smtp.gmail.com";

        // Get system properties
        Properties properties = System.getProperties();

        // Setup mail server
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        // Get the Session object.// and pass username and password
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {

                return new PasswordAuthentication("danielmunteanu907@gmail.com", "iyxpxtrpjsgqaucw");

            }

        });

        // Used to debug SMTP issues
        session.setDebug(true);

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set Subject: header field
            message.setSubject("This is the Subject Line!");

            // Now set the actual message
            message.setContent(
                    "<HTml>\n" +
                            "    <head>\n" +
                            "\n" +
                            "    </head>\n" +
                            "    <body>\n" +
                            "        <div style = \" width: 600px; background-color: azure; font-family:'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\">\n" +
                            "            <img style='vertical-align:middle;width:100px;height:100px' src='https://admitere.utm.md/wp-content/uploads/2022/01/logo-sigla.png'>\n" +
                            "            <h1 style='vertical-align:middle; display:inline;'>Aviz de recuperare a absenţelor</h1>\n" +
                            "            <p><h3>Au apărut noi recuperări în cadrul contului dumneavoastră de SIMU!</h3></p>\n" +
                            "            <p>Rugăm să verificaţi contul dumneavoastră pentru a vedea zilele de recuperare al absenţelor de la lucrările de laborator.</p>\n" +
                            "            <p>De asemenea, rugăm să verificaţi corectitudinea datelor pentru a evita orice eroare!</p>\n" +
                            "            <p>În caz de eroare, adresaţi-vă responsabilului din Decanatul UTM.</p>\n" +
                            "        </div>\n" +
                            "    </body>\n" +
                            "</HTml>",
                    "text/html");

            System.out.println("sending...");
            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }

    }

}