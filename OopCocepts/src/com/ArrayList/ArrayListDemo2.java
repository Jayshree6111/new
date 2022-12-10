package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(0, 50);
		System.out.println(al.size());
	
		
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
			
		
		}
		for(int i:al) {
			System.out.println(i);
			
		}	
		al.forEach(ab->System.out.println(ab));
	}	
}
