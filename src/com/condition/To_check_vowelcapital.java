package com.condition;
import java.util.Scanner;
public class To_check_vowelcapital {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Character :");
		char ch;
		ch=sc.next().charAt(0);
		if(ch=='A'||ch=='a')
		{
			System.out.println(ch+" vowel");
		}
		else if(ch=='E'||ch=='e')
		{
			System.out.println(ch+" vowel");
		}
		else if(ch=='I'||ch=='i')
		{
			System.out.println(ch+" vowel");
		}
		else if(ch=='O'||ch=='o')
		{
			System.out.println(ch+" vowel");
		}
		else if(ch=='U'||ch=='u')
		{
			System.out.println(ch+" is vowel");
		}
		else
		{
			System.out.println(ch+ " is consonant");
		}

	}

}
