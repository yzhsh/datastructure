package com.my.design.pattern.decorator;

public class Source implements Sourceable {

	@Override
	public void method() {
		System.out.println("the original method!");
	}
}