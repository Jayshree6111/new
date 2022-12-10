package com.Interview_4;
import java.util.Scanner;

public class ReverseNo {
	public int reverse(int num){
		
		
		int reverse = 0;
		while (num!= 0) {
		reverse = reverse * 10;
		reverse = reverse + num % 10;
		num = num / 10;
		}
		return reverse;
		
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	 int num = sc.nextInt();
	ReverseNo rev = new ReverseNo();
	
	 int result = rev.reverse(num);
	System.out.println(result);
	
	
}
}
