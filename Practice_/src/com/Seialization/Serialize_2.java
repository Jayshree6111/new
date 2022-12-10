package com.Seialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialize_2 {
	public static void main(String[] args) {
		Serialize s = new Serialize();
		s.Name = "Jayshree";
		try {
			FileOutputStream fos = new FileOutputStream("D:\\jayshree.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s);
			oos.flush();
			System.out.println("serialization done");
			
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
	}

}
