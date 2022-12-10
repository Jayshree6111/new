package com.forPractice;
import java.util.Scanner;

public class Cube {
	public int cube(int num) {
		int c = num * num * num;
		
		return c;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		Cube cb = new Cube();
		int result = cb.cube(num);
		System.out.println("Cube of "+num + " is "+result);
		
		
	}


}
