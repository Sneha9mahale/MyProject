package com.While;
import java.util.Scanner;
public class PowerNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base");
		int base=sc.nextInt();
		System.out.println("Enter Exponent");
		int expo=sc.nextInt();
		int i=1;
		int power=1;
		while(i<=expo)
		{
			power=power*base;
			i++;
		}
		System.out.println(power);

	}

}
