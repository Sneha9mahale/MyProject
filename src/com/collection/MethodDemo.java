package com.collection;
import java.util.*;
public class MethodDemo {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList();
		al.add("pune");
		al.add("Mumbai");
		al.add("Goa");
		System.out.println(al);
		al.add(1, "nashik");
		System.out.println(al);
		al.set(2,"Banglore");
		System.out.println(al);
		
		ArrayList<String>al2=new ArrayList();
		al2.add("pune");
		al2.add("Gujrat");
		al2.add("Goa");
		System.out.println(al2);
//		
//		al2.addAll(al);
//		System.out.println(al2);
//		al2.remove(1);
//		System.out.println(al2);
		
//		al.remove("Goa");
//		System.out.println(al);
//		al.removeAll(al2);
//		System.out.println(al);
//		System.out.println(al2);
		
//		al.retainAll(al2);
//		System.out.println(al);
//		al.addAll(al2);
//		System.out.println(al);
//		al.retainAll(al2);
//		System.out.println(al2);
//		System.out.println(al);
//		System.out.println(al2);
		
		
		System.out.println(al.contains("pune"));
		List<String>list=al.subList(1, 3);
		System.out.println(list);
		System.out.println(al);
		
		
	}

}
