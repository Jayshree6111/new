package com.forPractice;
import java.util.Scanner;

public class Check {
	public static void charType() {
		System.out.println("Enter the character");
		Scanner sc =  new Scanner(System.in);
		int ch = sc.next().charAt(0);
		if(ch>=65 && ch<=90) {
			System.out.println("Capital Letter");
			
		}else if(ch>=97 && ch<=122) {
			System.out.println("Small Letter");
		}else if (ch>=48 && ch<=57) {
			System.out.println("NUmbers");
		}else {
			System.out.println("this are symbolls");
		}
		
	}
	public static void main(String[] args) {
		Check obj = new Check();
		obj.charType();
		
	}

}
