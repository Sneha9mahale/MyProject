package com.string;
import java.util.Scanner;
public class WordReverse {
	public void reversWord(String s)
	{
		String[] str=s.split(" ");
		String revstr="";
		for(int i=0;i<str.length;i++)
		{
			String word=str[i];
			String reversestr="";
			for(int j=word.length()-1;j>=0;j--)
			{
				reversestr=reversestr+word.charAt(j);
			}
			//revstr=reversestr+" "+revstr;
			revstr=revstr+reversestr+" ";
		}
		System.out.println(revstr);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		WordReverse w=new WordReverse();
		w.reversWord(s);
	}

}



