package com.Loops;
//palindrome no
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num=sc.nextInt();
		int re=0,rev=0;
		int temp=num;
		while(num>0)
		{
			re=num%10;
			rev=rev*10+re;
			num=num/10;	
		}
		System.out.println(rev);
		num=temp;
		if(num==rev)
		{
			System.out.println("No is palindrome");
		}
		else
		{
			System.out.println("No is not palindrome");
		}

	}

}
