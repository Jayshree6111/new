package com.Interview_6;

public class ReverseNumber {
	public int reverse() {
		int num=521;
		int reverse =0;
		while(num!= 0) {
			reverse = reverse *10;
			reverse = reverse + num % 10;
			num = num / 10;
			
		}
		return reverse;
	}

	public static void main(String[] args) {
		ReverseNumber rv = new ReverseNumber();
		
		int result = rv.reverse();
		System.out.println(result);
		
		
		

	}

}
