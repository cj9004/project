package com.project.controllers.utils;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * Send Mail Utility
 * @author Cj
 * @since 9/10/2019
 */
public class SendMailUtil {

	public static final String FROM_MAIL = "cjTest9004@gmail.com";
	public static final String FROM_MAIL_PASS = "1234cjTest";
	
	
	public static void  send(String receiver, String subject, String textMessage ) {
		Properties props = getProperties();
	    Session session = Session.getDefaultInstance(props);
	    MimeMessage message = new MimeMessage(session);
	    try {
	        message.addRecipients(Message.RecipientType.TO, "cyndicj33@gmail.com" + "," + receiver); 
	        message.setSubject(subject);
	        message.setText(textMessage);
	        Transport transport = session.getTransport("smtp");
	        transport.connect("smtp.gmail.com", FROM_MAIL, FROM_MAIL_PASS);
	        transport.sendMessage(message, message.getAllRecipients());
	        transport.close();
	    }
	    catch (Exception me) {
	        me.printStackTrace();  
	    }
	}

	/**
	 * Prepare the properties for send
	 * the mail
	 * @return
	 */
	private static Properties getProperties() {
		Properties props = new Properties();
	    props.put("mail.smtp.auth", true);
	    props.put("mail.smtp.starttls.enable", true);
	    props.put("mail.smtp.host", "smtp.gmail.com");
	    props.put("mail.smtp.port", "587");
	    props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
	    return props;
	}

}
