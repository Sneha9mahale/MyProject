package com.condition;
import java.util.Scanner;
public class To_check_vowelcapital {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Character :");
		char ch;
		ch=sc.next().charAt(0);
		if(ch=='A')
		{
			System.out.println(ch+" vowel");
		}
		else if(ch=='E')
		{
			System.out.println(ch+" vowel");
		}
		else if(ch=='I')
		{
			System.out.println(ch+" vowel");
		}
		else if(ch=='O')
		{
			System.out.println(ch+" vowel");
		}
		else if(ch=='U')
		{
			System.out.println(ch+" is vowel");
		}
		else
		{
			System.out.println(ch+ " is consonant");
		}

	}

}
