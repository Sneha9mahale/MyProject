package com.string;

import java.util.Scanner;

public class MiddleReverse {
	public static void middleWord(String s)
	{
		String str[]=s.split(" ");
		String firstword="";
		for(int i=1;i<str.length-1;i++)
		{
			String reversemiddle="";
			String word=str[i];
			for(int j=word.length()-1;j>=0;j--)
			{
				reversemiddle=reversemiddle+word.charAt(j);		
			}
			firstword=firstword+reversemiddle+" ";
		}
		System.out.println(str[0]+" "+firstword+" "+str[str.length-1]);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		MiddleReverse.middleWord(s);
	}

}
