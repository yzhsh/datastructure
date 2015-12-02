package com.my.design.pattern.factory;

public class MailSenderFactory implements Provider {

	@Override
	public Sender producer() {
		return new MailSender();
	}

}
