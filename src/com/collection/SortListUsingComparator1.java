package com.collection;
import java.util.*;
public class SortListUsingComparator1 {

	public static void main(String[] args) {
		LinkedList<String>namelist=new LinkedList<>();
		namelist.add("Harsh");
		namelist.add("Arav");
		namelist.add("Dipak");
		namelist.add("Pratisha");
		namelist.add("Aranav");
		System.out.println(namelist);
		System.out.println("Sorting in accending order : ");
		Collections.sort(namelist);
		System.out.println(namelist);
		System.out.println("Sorting in descending order : ");
		Collections.sort(namelist, Collections.reverseOrder());
		System.out.println(namelist);
		System.out.println("Sorting in descending order : ");
		Collections.sort(namelist);
		Collections.reverse(namelist);
		System.out.println(namelist);
	}

}
