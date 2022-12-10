package com.ObjectClass;

public class Example implements Cloneable{
	int x;
	public static void main(String[] args) throws CloneNotSupportedException {
		Example exp1 = new Example();
		exp1.x = 10;
		System.out.println("1st object"+exp1.x);
		Object exp2 = exp1.clone();
		System.out.println("2nd object "+exp2);
	}

}
