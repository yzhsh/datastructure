package com.my.design.pattern.builder;

import java.util.ArrayList;
import java.util.List;

import com.my.design.pattern.factory.MailSender;
import com.my.design.pattern.factory.Sender;
import com.my.design.pattern.factory.SmsSender;

//注意与工厂模式的区别
public class Builder {

	private List<Sender> list = new ArrayList<Sender>();

	public void produceMailSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new MailSender());
		}
	}

	public List<Sender> getList() {
		return list;
	}

	public void setList(List<Sender> list) {
		this.list = list;
	}

	public void produceSmsSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new SmsSender());
		}
	}
}
