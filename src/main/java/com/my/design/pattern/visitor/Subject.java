package com.my.design.pattern.visitor;

public interface Subject {
	public void accept(Visitor visitor);

	public String getSubject();
}