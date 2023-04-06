package com.string;
import java.util.Scanner;
public class Reverse {
	public static void revStringe(String s)
	{
		String revstr="";
		for(int i=s.length()-1;i>=0;i--)
		{
			revstr=revstr+s.charAt(i);
		}
		System.out.println(revstr);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.nextLine();
		Reverse.revStringe(s);
		
		//System.out.println(Reverse.strRevers(s));

	}

}
