package com.collection;
import java.util.*;
public class ArrayToList {

	public static void main(String[] args) {
		String str[]= {"pune","Nashik","Banglore","Goa"};
		ArrayList<String>list1=new ArrayList(Arrays.asList(str));
		for(String s:list1)
		{
			System.out.println(s);
		}
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		ArrayList<String>list2=new ArrayList();
		Collections.addAll(list2,str);
	System.out.println(list2);
	System.out.println("--------Manual---------");
	ArrayList<String>list3=new ArrayList();
	for(int i=0;i<str.length;i++)
	{
		list3.add(str[i]);
	}
	System.out.println(list3);
	}

}
