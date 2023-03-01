package com.Test1;
import java.util.Scanner;
public class Trimorphic_num {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,cube=0,r;
		int temp=cube;
		System.out.println("Enter the number");
		num=sc.nextInt();
		cube=num*num*num;
		r=cube%10;
		cube=temp;
		if(num==r)
		{
			System.out.println("Number is Trimorphic");
		}
		else
		{
			System.out.println("Number is not Trimorphic");
		}

	}

}
