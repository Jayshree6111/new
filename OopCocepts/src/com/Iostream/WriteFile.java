package com.Iostream;
import java.io.FileWriter;


public class WriteFile {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("C:\\Users\\jaysh\\Desktop\\jaya.txt");
			fw.write("wagh jayshree");
			fw.close();
			
		}catch(Exception e) {
			System.out.println(e);
			
		}
		System.out.println("Sucess");
	}

}
