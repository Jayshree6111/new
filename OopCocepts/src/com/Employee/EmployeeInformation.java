package com.Employee;
import java.util.Scanner;

public class EmployeeInformation {
	public void gerUserDetails() {
		Employee obj = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name");
		 obj.firstName = sc.next();
		System.out.println("Enter last name");
		 obj.lastName = sc.next();
		System.out.println("Enter city");
		 obj.city = sc.next();
		System.out.println("Enter mobile no");
		 obj.mobileNumber = sc.nextLong();
		 
		 getStudentInformation( obj.firstName,obj.lastName, obj.city,
				 obj.mobileNumber, Employee.Country);
		
	}
	 public void getStudentInformation(String firstName,String lastName,String city,
				long mobileNumber, String Country) {
		 System.out.println("Student Information");
		 System.out.println("First name : "+firstName);
		 System.out.println("Last name : "+lastName);
		 System.out.println("City : "+city);
		 System.out.println("Mobile no : "+mobileNumber);
		 System.out.println("Country : "+Country);
		 
			
		}
	public static void main(String[] args) {
		
		EmployeeInformation emp = new EmployeeInformation();
		System.out.println("Enter no of students");
		Scanner sc1= new Scanner(System.in);
		int count = sc1.nextInt();
		for(int i = 1; i<=count; i++) {
			System.out.println("Enter student details");
			emp.gerUserDetails();
		}
		
	}

}
