package com.collection;

import java.util.*;

public class ListToArray1 {

	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		al.add(12);
		al.add(14);
		al.add(5);
		al.add(67);
		al.add(89);
		//First method to conversion
		Object a[]=al.toArray();
		System.out.println("ArrayList converted To Object Array ");
		System.out.println(Arrays.toString(a));
		
		//Second method
		Integer in[]=new Integer[al.size()];
		al.toArray(in);
		System.out.println("ArrayList converted To Integer Array ");
		System.out.println(Arrays.toString(in));
				
	}

}
