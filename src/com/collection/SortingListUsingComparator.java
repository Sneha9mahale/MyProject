package com.collection;
import java.util.*;
public class SortingListUsingComparator {

	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		al.add(64);
		al.add(56);
		al.add(89);
		al.add(78);
		al.add(123);
		System.out.println(al);
		System.out.println("Sorting in accending order : ");
		Collections.sort(al);
		System.out.println(al);
		System.out.println("Sorting in descending order : ");
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		System.out.println("Sorting in descending order : ");
		Collections.sort(al);
		Collections.reverse(al);
		System.out.println(al);
	}

}
