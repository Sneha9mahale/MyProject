package com.collection;
import java.util.*;
public class ListToArray {

	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList();
		al.add(23);
		al.add(12);
		al.add(3);
		al.add(89);
		al.add(45);
		System.out.println(al);
		System.out.println("*******List To Array1*****");
		Object o[]=al.toArray();
		Integer myarray[]=al.toArray(new Integer[al.size()]);
		for(int i=0;i<myarray.length;i++)
		{
			System.out.println(myarray[i]);
		}
		
		System.out.println("*******List To Array2*****");
		Integer a[]=new Integer[al.size()];
		for(int i=0;i<al.size();i++)
		{
			a[i]=al.get(i);
		}
		System.out.println(Arrays.toString(a));
	}

}
