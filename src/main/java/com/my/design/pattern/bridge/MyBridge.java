package com.my.design.pattern.bridge;

public class MyBridge extends Bridge {
	public void method() {
		getSource().method();
	}
}