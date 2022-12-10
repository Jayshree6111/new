package com.forPractice;
import java.util.Scanner;

public class Factor {
	public static void factor(int num) {
		int i=1;
		while(i<=num) {
			if(num%i == 0) {
				System.out.println(i);
			}
			i++;
		}
		
		
	}
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		Factor fac = new Factor();
		fac.factor(num);
		
	}

}
