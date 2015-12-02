package com.my.design.pattern.builder;

import java.util.List;

import com.my.design.pattern.factory.Sender;

public class Test {

	public static void main(String[] args) {
		Builder builder = new Builder();
		builder.produceMailSender(10);
		builder.produceSmsSender(10);
		
		List<Sender> senders = builder.getList();
		for(Sender sender : senders) {
			sender.send();
		}
	}
}