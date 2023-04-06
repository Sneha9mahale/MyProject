package com.string;

public class StringMethod {

	public static void main(String[] args) {
		String s="Welcome To Think Quotient";
		System.out.println(s.length());
		
		String st1=s.substring(5);
		System.out.println(st1);
		
		String st2=s.substring(5,25);
		System.out.println(st2);
		
		char ch=s.charAt(4);
		System.out.println(ch);
		
		int start=s.indexOf('t');
		System.out.println(start);
		
		int end=s.lastIndexOf('e');
		System.out.println(end);
		
		String s2="c@c++@java@python";
		String str[]=s2.split("@");
		
		for(String sr:str)
		{
			System.out.println(sr);
		}
	}

}
