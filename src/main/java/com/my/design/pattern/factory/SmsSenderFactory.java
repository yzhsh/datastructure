package com.my.design.pattern.factory;

public class SmsSenderFactory implements Provider {

	@Override
	public Sender producer() {
		return new SmsSender();
	}

}
