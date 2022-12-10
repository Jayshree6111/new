package com.Inheritance;
import java.util.Scanner;

public class AccountImpl implements Account{
	public void getSavingAccount() {
		
		float balance = 20000;
		float balance1 = 30000;
		float balance2 = 40000;
		
		System.out.println("Enter name ");
		Scanner sc= new Scanner(System.in);
		 String name = sc.next().intern();
		 if(name == "jayshree" || name == "nikhil" ||name == "Ganesh") {
			 System.out.println(balance);
			 System.out.println(balance1);
			 System.out.println(balance2);
			 
		 }else {
			 System.out.println("Invali name");
		 }	
		
	}
	public void getUserDetails(String name, float balance) {
		
	}

	public static void main(String[]  args) {
		AccountImpl acc = new AccountImpl();
		acc.getSavingAccount();
		
		
	}
}
