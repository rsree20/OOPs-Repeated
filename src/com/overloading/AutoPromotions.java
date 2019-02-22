package com.overloading;

public class AutoPromotions {
	
	public static void main(String[] args) {
		
		Test t = new Test();
	//	t.method1(100, 200);
		
	}

}

class Test{
	
	
	
	void method1(int i, long l) {
		System.out.println("Method-1");
	}
	
	void method1(long l, int i) {
		System.out.println("Method-2");
	}
	
//	void method1(float i) {
//		System.out.println("Method-3");
//	}
//	
//	void method1(double i) {
//		System.out.println("Method-4");
//	}
	
}