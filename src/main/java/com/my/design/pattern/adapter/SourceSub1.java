package com.my.design.pattern.adapter;

//接口适配
public class SourceSub1 extends Wrapper2 {
	public void method1() {
		System.out.println("the sourceable interface's first Sub1!");
	}
}