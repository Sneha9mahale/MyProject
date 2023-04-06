package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {
	public static void checkAnagram(String s1,String s2)
	{
		String st1=s1.toLowerCase();
		String st2=s2.toLowerCase();
		
	System.out.println(st1+" "+st2);
	
	char ch1[]=st1.toCharArray();
	char ch2[]=st2.toCharArray();
	
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	
	System.out.println(Arrays.toString(ch1));
	System.out.println(Arrays.toString(ch2));
	
	String str1=new String(ch1);
	String str2=new String(ch2);
	
	if(str1.compareTo(str2)==0)
	{
		System.out.println("Anagram");
	}
	else
	{
		System.out.println("Not anagram");
	}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter first String");
		String s1=sc.nextLine();
		System.out.println("Enter second String");
		String s2=sc.nextLine();
		StringAnagram.checkAnagram(s1, s2);
	}

}
