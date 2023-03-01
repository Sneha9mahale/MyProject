package Ternary;

import java.util.Scanner;

public class Greater50_100 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter Number :");
		num=sc.nextInt();
		String ans=num>50?num<100?"Greater than 50 nd 100":"Greater than 100":"less than 50";
		System.out.println(ans);
	}

}
