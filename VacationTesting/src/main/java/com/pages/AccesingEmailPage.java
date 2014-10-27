package com.pages;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.BodyPart;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;

import org.junit.Assert;

import com.sun.mail.imap.protocol.BODY;

import net.thucydides.core.pages.PageObject;

//@DefaultUrl("http://192.168.1.68:9090/home")
public class AccesingEmailPage extends PageObject {

	StateVacationRequestPage stateVacationRequestPage;

	public void readEmail(String emailLink, String emailAddress, String password) throws MessagingException, IOException {
		Properties props = new Properties();
		props.setProperty("mail.store.protocol", "imaps");
		System.out.println("adfh");
		
			Session session = Session.getInstance(props, null);
			Store store = session.getStore();
			// props.put("mail.imap.port", "993");
			props.put("mail.imap.port", "143");
			store.connect(emailLink, emailAddress, password);
			// store.connect(emailLink, emailAddress, password);
			Folder inbox = store.getFolder("Inbox");
			inbox.open(Folder.READ_ONLY);
			Message msg = inbox.getMessage(inbox.getMessageCount());
			String emailSubject = msg.getSubject();
			Date sd = msg.getSentDate();
			SimpleDateFormat newDate = new SimpleDateFormat("dd-MM-yy:HH:mm:SS");
			String sentDate = newDate.format(sd);

			Object content = msg.getContent();
			Address[] in = msg.getFrom();
			// for (Address address : in) {
			// System.out.println("SUBJECT:" + emailSubject);
			// }
			// if (content instanceof String) {
			String body = (String) content;

			System.out.println("SENT DATE:" + sentDate);
			System.out.println("SUBJECT:" + emailSubject);
			System.out.println("CONTENT:" + body);
			// }
			//
			// else {
			// Multipart mp = (Multipart) msg.getContent();
			//
			// BodyPart bp = mp.getBodyPart(0);
			// System.out.println("SENT DATE:" + sentDate);
			// System.out.println("SUBJECT:" + emailSubject);
			// System.out.println("CONTENT:" + bp.getContent());
			// }
			// boolean found = false;
			// if()

			System.out.println("before assert");
			Assert.assertTrue(
					"hopahopa",
					emailSubject.contains("You have submitted a new Vacation Request")
							&& sentDate.contains(stateVacationRequestPage
									.getDateCreatedON())
							&& content.toString().contains(
									stateVacationRequestPage
											.createEmailContent()));


	}

}
