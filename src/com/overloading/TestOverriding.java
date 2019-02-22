package com.overloading;

class Parent{
	
	
	int x =100;
	public Parent method1() {
		System.out.println("hello, parent method1 "+x);
		return null;
	}
}

class Child extends Parent{
	
	
	 public Child method1()  throws ArithmeticException {
		 x=500;
		System.out.println("hello, child method1 "+x);
		return null;
	}
}
public class TestOverriding {
	
	public static void main(String[] args) {
		Child c = new Child();
		
		System.out.println(c.x);
		c.method1();
		System.out.println(c.x);
				
	}

}
