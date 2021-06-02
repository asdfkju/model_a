package com.model.a.util;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class naverAuthentication extends Authenticator {
	PasswordAuthentication passAuth;
	
	public naverAuthentication() {
		passAuth = 
			new PasswordAuthentication("qwerty123258","628D6MSGK4GH");
	}
	
	public PasswordAuthentication getPasswordAuthentication() {
		return passAuth;
	}
}
