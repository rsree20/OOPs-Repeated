package com.overloading;

public class TestOverloading {

	public static void main(String[] args) {
		
		DAO d = new DAO();

		byte b =125;
		d.addition(b);
	}
}

class DAO{
	
	
	/*void addition(Object s) {
		System.out.println("First Method...");
		
	}
	
	void addition(Number n) {
		System.out.println("Second Method...");
	}
	
	void addition(Integer s) {
		System.out.println("Third Method...");	
	}*/
	
	void addition(int x) {
		System.out.println("Fourth Method...");		
	}
	
	void addition(byte x) {
		System.out.println("Fifth Method...");
	}
	
}