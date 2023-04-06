package com.string;
import java.util.Scanner;
public class NoOfChar {
	public static void countNoOfChar(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			str.charAt(i);
			count++;
		}
		System.out.println(count++);
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	NoOfChar.countNoOfChar(str);
	}

}
