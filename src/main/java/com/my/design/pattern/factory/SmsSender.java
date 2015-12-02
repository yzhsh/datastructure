package com.my.design.pattern.factory;

public class SmsSender implements Sender {

	@Override
	public void send() {
		System.out.println("Sms sender!");
	}

}
