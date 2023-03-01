package Ternary;
import java.util.Scanner;
public class Odd_even {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter Number :");
		num=sc.nextInt();
		String ans=num%2==0?"even":"odd";
		System.out.println(ans);

	}

}
