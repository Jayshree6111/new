package com.forPractice;

public class Count {
	static int countObject;
	Count(){
		countObject++;
	}
	public static void getObjectCount() {
		System.out.println("Number of objects "+countObject);
		
	}
	public static void main (String[] args) {
	
		Count co = new Count();
		Count co1 = new Count();
		Count co2 = new Count();
		getObjectCount();
	}

}
