package com.pages;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.BodyPart;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Store;

import net.thucydides.core.pages.PageObject;

//@DefaultUrl("http://192.168.1.68:9090/home")
public class AccesingEmailPage extends PageObject {

	public void readEmail(String emailLink, String emailAddress,String password) {
		Properties props = new Properties();
		props.setProperty("mail.store.protocol", "imaps");
		try {
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
			String sentDate = msg.getSentDate().toString();
			Object content = msg.getContent();
			Address[] in = msg.getFrom();
			for (Address address : in) {
				System.out.println("SUBJECT:" + emailSubject);
			}
			if (content instanceof String) {
				String body = (String) content;
				
				System.out.println("SENT DATE:" + sentDate);
				System.out.println("SUBJECT:" + emailSubject);
				System.out.println("CONTENT:" + body);
			}

			else {
				Multipart mp = (Multipart) msg.getContent();

				BodyPart bp = mp.getBodyPart(0);
				System.out.println("SENT DATE:" + sentDate);
				System.out.println("SUBJECT:" + emailSubject);
				System.out.println("CONTENT:" + bp.getContent());
			}

		} catch (Exception mex) {
			mex.printStackTrace();
		}
	}

}
