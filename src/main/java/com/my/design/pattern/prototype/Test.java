package com.my.design.pattern.prototype;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {

		Prototype pro = new Prototype();
		pro.setObj(new SerializableObject());
		Prototype pro1 = (Prototype) pro.deepClone(); //浅拷贝只是引用，指向同一块堆内存，深拷贝则是申请一个新的对内存
		System.out.println(pro.getObj());
		System.out.println(pro1.getObj());
		System.out.println(pro1 instanceof Prototype);
	}

}
