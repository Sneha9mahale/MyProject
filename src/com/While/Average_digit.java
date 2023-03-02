package com.While;
import java.util.Scanner;
public class Average_digit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		int count=0;
		int sum=0;
		int temp=num;
		while(num>0)
		{
			int r=num%10;
			sum=sum+r;
			num=num/10;
		}
		num=temp;
		while(num>0)
		{
			int r=num%10;
			count++;
			num=num/10;
		}
		System.out.println("no of digit = "+count);
		System.out.println("sum ="+sum);
		int avg=sum/count;
		System.out.println("sum = "+sum+"no of digit = "+count+" avg = "+avg);
	}

}
