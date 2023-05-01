package com.collection;
import java.util.*;
public class GenericArrayList {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<>();
		System.out.println(list);
		list.add(23);
		list.add(new Integer(53));
		list.add((int)45.56f);
		list.add(23);
		System.out.println(list);
		for(int i=0;i<list.size();i++)
		{
			int data=list.get(i);
			list.set(i, data+5);
		}
		System.out.println("After Adding 5 to each element : ");
		System.out.println(list);
		for(Integer o:list)
		{
			System.out.println("Object Is : "+o);
		}
		
	}

}
