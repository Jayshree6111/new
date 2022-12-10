package com.forPractice;
import java.util.Scanner;

public class ArmstrongNumber {
	public boolean Arm(int num) {
		int tempValue = num;
		int sum = 0;
		while (num != 0) {
			int remainder = num % 10;
			sum = sum + (remainder * remainder * remainder);
			num = num / 10;
		}
		if (sum == tempValue) 
			return true;
			else 
				return false;
		}
	public static void main(String[] args) {
		ArmstrongNumber arms = new ArmstrongNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int value = sc.nextInt();
		if(arms.Arm(value))
			System.out.println(value+ " Is amstrong number");
		else 
			System.out.println(value+ " Is not amstrong number");
		
	}
	}


