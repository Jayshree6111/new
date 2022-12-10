package com.forPractice;
import java.util.Scanner;

public class FibonacciNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int input = sc.nextInt();
		int value1 = 0;
		int value2 = 1;
		for(int i = 1;i<= input;i++) {
			System.out.print(value1+",");
			int temp = value1;
			value1 = value1 + value2;
			value2 = temp;
			
			
		}
		
	}

}
