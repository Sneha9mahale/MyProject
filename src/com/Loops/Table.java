package com.Loops;
import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,t;
		System.out.println("Enter any number");
		num=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			t=num*i;
			System.out.println(t+" = "+num+" * "+i);
		}

	}

}
