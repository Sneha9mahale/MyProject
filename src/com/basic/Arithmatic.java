package com.basic;
import java.util.Scanner;
//Write a Java program to enter two numbers and perform all arithmetic operations
public class Arithmatic {
	
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	int num1,num2,add,sub,mul,div,rem;
	System.out.println("Enter first number : ");
	num1=sc.nextInt();
	System.out.println("Enter second number : ");
	num2=sc.nextInt();
	add=num1+num2;
	sub=num1-num2;
	mul=num1*num2;
	div=num1/num2;
	rem=num1%num2;
	System.out.println("Addition= "+add);
	System.out.println("Substraction = "+sub);
	System.out.println("Multiplication = "+mul);
	System.out.println("Division = "+div);
	System.out.println("Remender = "+rem);
	}
}
