package com.While;
import java.util.Scanner;
public class Count_Digit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The number :");
		int num=sc.nextInt();
		int count=0;
		while(num>0)
		{
			int r=num%10;
			++count;
			num=num/10;
		}
		System.out.println(count);
	}

}
