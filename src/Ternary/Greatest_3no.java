package Ternary;
import java.util.Scanner;
public class Greatest_3no {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("Enter First Number:");
		num1=sc.nextInt();
		System.out.println("Enter Second Number:");
		num2=sc.nextInt();
		System.out.println("Enter Third Number:");
		num3=sc.nextInt();
		String ans=num1>num2?num1>num3?"num1 is grester":"num3 is greater":num2>num3?"num2 is greater":"num3 is greater";
		System.out.println(ans);

	}

}
