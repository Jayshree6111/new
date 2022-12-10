package com.ObjectClass;

public class AllObjectClass {
	int a ;
	
	
	public static void main(String[] args) {
		AllObjectClass obj = new AllObjectClass();
		obj.a=10;
		AllObjectClass obj1 = new AllObjectClass();
		obj.a=10;
		System.out.println(obj.getClass().getName());
		System.out.println(obj.getClass().getSimpleName());
		System.out.println(obj.getClass().getModifiers());
		System.out.println(obj.getClass().hashCode());
		System.out.println(obj.hashCode());
		System.out.println(obj.hashCode());
		
		System.out.println(obj.equals(obj1));
	}	

}
