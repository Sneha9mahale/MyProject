package com.string;

public class StringComparison {
	public static void compareByEqual(String s1,String s2)
	{
		boolean isSame=s1.equals(s2);
		System.out.println(isSame);
		System.out.println(s1.equalsIgnoreCase(s2));
	}
	public static void compareByCompareTo(String s1,String s2)
	{
		int i=s1.compareTo(s2);
		System.out.println(i);
	}
	

	public static void main(String[] args) {
		String s1="hello";
		String s2="hello";
		StringComparison.compareByEqual(s1, s2);
		StringComparison.compareByCompareTo(s1, s2);

	}

}
