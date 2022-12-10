package com.Iostream;
import java.util.Scanner;
import java.io.*;

public class ReadFile {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\jaysh\\Desktop\\jaya.txt");
			Scanner sc = new Scanner(fis);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		}catch (IOException e){
			e.printStackTrace();
			
		}
	
		
	}

}
