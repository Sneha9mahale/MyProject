package com.condition;
import java.util.Scanner;
public class Switch_check_vowel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch;
		System.out.println("Enter any character");
		ch=sc.next().charAt(0);
		switch(ch)
		{
		case 'a':
			System.out.println("vowel");
			break;
		case 'e':
			System.out.println("vowel");
			break;
		case 'i':
			System.out.println("vowel");
			break;
		case 'o':
			System.out.println("vowel");
			break;
		case 'u':
			System.out.println("vowel");
			break;
		default:
			System.out.println("Consonant");
		}
		
		

	}

}
