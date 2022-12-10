package com.Abstraction;

public class Test2 extends Test {

	
	void a1() {
		System.out.println("Method a1");
	}

	
	void a2() {
		System.out.println("Method a2");
	
		
	}
	public static void main(String[] args) {
		Test2 test = new Test2();
		test.a1();
		test.a2();
	}

}
