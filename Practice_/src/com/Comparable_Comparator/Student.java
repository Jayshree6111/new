package com.Comparable_Comparator;

import java.util.Collections;
import java.util.HashMap;

public class Student  implements Comparable<Student>{
	public static void main(String[] args) {
		HashMap<String,Integer> al = new HashMap<String,Integer>();
		al.put("jaya", 10);
		al.put("sneha", 20);
		 Collections.sort(al);
	}
	

	@Override
	public int compareTo(Student stu) {
		return this.compareTo(stu);
	}
	

}
