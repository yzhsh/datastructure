package com.my.design.pattern.factory;

public class MailSender implements Sender {

	@Override
	public void send() {
		System.out.println("Mail sender!");
	}

}
