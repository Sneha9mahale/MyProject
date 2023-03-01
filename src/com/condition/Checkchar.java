package com.condition;
import java.util.Scanner;
public class Checkchar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Character :");
		char ch;
		ch=sc.next().charAt(0);
		if(ch>='A'&&ch<='Z')
		{
			System.out.println("Character is Capital Letter");
		}
		else if(ch>='a'&&ch<='z')
		{
			System.out.println("Character is Small Letter");
		}
		else
		{
			System.out.println("char not alphabet");
		}
	}

}
