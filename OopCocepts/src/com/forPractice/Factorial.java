package com.forPractice;
import java.util.Scanner;

public class Factorial {
	public int factorial(int num) {
		int fact = 1;
		for(int i = 1; i <= num; i++ ) {
		fact = fact * i;
		
		}	
		return fact;
	}
public static void main(String [] args) {
	System.out.println("Enter a number");

	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	Factorial fac = new Factorial();
	int result = fac.factorial(num);
	System.out.println("factorial is "+result);
	
}
}
