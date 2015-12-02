package com.my.design.pattern.factory;

public class Test {

	public static void main(String[] args) {

		Sender sender = new MailSenderFactory().producer();
		sender.send();
	}

}
