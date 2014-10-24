package com.pages;

import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Store;

import net.thucydides.core.pages.PageObject;

//@DefaultUrl("http://192.168.1.68:9090/home")
public class AccesingEmailPage extends PageObject {

	public  String readSubject(String emailLink, String emailAddress, String password, String emailSubject) {
		Properties props = new Properties();
		props.setProperty("mail.store.protocol", "imaps");
		try {
			Session session = Session.getInstance(props, null);
			Store store = session.getStore();
			 //props.put("mail.imap.port", "993");
			props.put("mail.imap.port", "143");
			store.connect(emailLink, emailAddress, password);
			 //store.connect(emailLink, emailAddress, password);
			Folder inbox = store.getFolder("Inbox");
			inbox.open(Folder.READ_ONLY);
			Message msg = inbox.getMessage(inbox.getMessageCount());
			emailSubject = msg.getSubject();
			
			System.out.println("SUBJECT:" + emailSubject);	
			
		} catch (Exception mex) {
			mex.printStackTrace();
		}
		return emailSubject;
	}
	
	public  String readBody(String emailLink, String emailAddress, String password, String emailSubject) {
		Properties props = new Properties();
		props.setProperty("mail.store.protocol", "imaps");
		try {
			Session session = Session.getInstance(props, null);
			Store store = session.getStore();
			 //props.put("mail.imap.port", "993");
			props.put("mail.imap.port", "143");
			store.connect(emailLink, emailAddress, password);
			 //store.connect(emailLink, emailAddress, password);
			Folder inbox = store.getFolder("Inbox");
			inbox.open(Folder.READ_ONLY);
			Message msg = inbox.getMessage(inbox.getMessageCount());
			emailSubject = msg.getSubject();
			
			System.out.println("SUBJECT:" + emailSubject);	
			
		} catch (Exception mex) {
			mex.printStackTrace();
		}
		return emailSubject;
	}
	
	
}
