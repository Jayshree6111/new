package com.forPractice;

import java.util.Scanner;

public class Reverse {
	public static int reverse(int num) {
		int reverse=0;
		while(num!=0) {
			reverse = reverse * 10 ;
			reverse = reverse + num % 10;
			num = num / 10;
			
		}
		return(reverse);
	}
	public static void main(String[] args) {
		System.out.println(" Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Reverse rev = new Reverse();
	int	result =  rev.reverse(num);
	System.out.println("reverse num is "+result);
			
		}
		
	}


