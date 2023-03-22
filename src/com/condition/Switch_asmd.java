package com.condition;
import java.util.Scanner;
//Write a Java program to create a Simple Calculator using switch
public class Switch_asmd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter first number");
		num1=sc.nextInt();
		System.out.println("Enter second number");
		num2=sc.nextInt();
		System.out.println("Enter the operation from the following menu");
		System.out.println("+.Addition \n -.Subtraction \n *.Multiplication \n /.Division");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
			case '+':
			System.out.println("Addition = "+(num1+num2));
			break;
			case '-':
				System.out.println("Substraction = "+(num1-num2));
				break;
			case '*':
				System.out.println("Multiplication = "+(num1*num2));
				break;
			case '/':
				System.out.println("division = "+(num1/num2));
				break;
			
		}

	}

}
