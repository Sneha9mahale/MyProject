package com.condition;
import java.util.Scanner;
public class To_check_vowel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Character :");
		char ch;
		ch=sc.next().charAt(0);
		if(ch =='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println(ch+" vowel");
		}
		else
		{
			System.out.println(ch+ " is consonant");
		}
		/*if(ch=='a')
		{
			System.out.println(ch+" vowel");
		}
		else if(ch=='e')
		{
			System.out.println(ch+" vowel");
		}
		else if(ch=='o')
		{
			System.out.println(ch+" vowel");
		}
		else if(ch=='i')
		{
			System.out.println(ch+" vowel");
		}
		else if(ch=='u')
		{
			System.out.println(ch+" is vowel");
		}
		else
		{
			System.out.println(ch+ " is consonant");
		}*/
	}

}
