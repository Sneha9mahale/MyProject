package com.collection;
import java.util.*;
public class ArrayToList1 {

	public static void main(String[] args) {
		//Convert Array to list,using Arrays.aslist
		String s[]= {"reading","writing","dancing","playing"};
//		List<String>hobbies=Arrays.asList(s);
//		System.out.println("List Of Hobbies ");
//		for(String h:hobbies)
//		{
//			System.out.println(h);
//		}
//		
//		ArrayList<String>hobbies1=new ArrayList(Arrays.asList(s));
//		System.out.println("List Of Hobbies1 ");
//		for(String h:hobbies1)
//		{
//			System.out.println(h);
//		}
		
		//Convert Array to arraylist,using Collections.addall 
		ArrayList<String>hobbies=new ArrayList<>();
		Collections.addAll(hobbies,s);
		for(String h:hobbies)
		{
			System.out.println(h);
		}
		//Another way
		Collections.addAll(hobbies,"cooking","tracking","singing");
		System.out.println(hobbies);
		
		//After sorting
		Collections.sort(hobbies);
		System.out.println(hobbies);
	}

}
