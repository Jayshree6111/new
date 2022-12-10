package com.forPractice;
import java.util.Scanner;

public class PrimeNo {
	
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		for(int i = num; i > 0 ; i--) {
			if(num%i==0) {
				count++;
			}
		}
		
		if (count>2) {
			System.out.println(" Not prime");
		}else {
			System.out.println("prime");
		}
	}

}
