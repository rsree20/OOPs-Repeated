package com.overloading;

public class TestConstructor {
	
	public static void main(String[] args) {
		
		Child c = new Child();
		c.m1();
	}
}
class Parent{
	
/*	Parent(int i) {
		System.out.println("1000");
	}

	Parent(String s) {
		this(10);
		System.out.println("1001");
	}

	Parent() {
		this("hello");
		System.out.println("1002");
	}*/
}

class Child extends Parent{
	
	Child(int i) {
		this();
		System.out.println("2001");
	}
	
	Child() {
		this(10);
		System.out.println("2000");
	}
	void m1() {
		System.out.println("30");
		m2();
	}
	void m2() {
		System.out.println("40");
		m1();
	}
}
