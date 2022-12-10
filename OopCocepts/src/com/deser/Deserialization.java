package com.deser;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
	public static void main(String args[]) {
		try {
			FileInputStream fis = new FileInputStream("D:\\serialization");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object o = ois.readObject();
			Student s =(Student) o;
			System.out.println(s.firstname);
			System.out.println(s.lastname);
			System.out.println(s.city);
		}catch (Exception e) {
			e.printStackTrace();
			
		}
	}

}
