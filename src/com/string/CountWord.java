package com.string;
import java.util.Scanner;
public class CountWord {
	public static void wordCount(String s)
	{
		int count=0;
		String[] st=s.split(" ");
		for(int i=0;i<st.length;i++)
		{
			count++;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		CountWord.wordCount(str);
	}

}
