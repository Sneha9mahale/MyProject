package com.condition;
import java.util.Scanner;
public class Switch_Area {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int l,b,r,arec,asqu,side,base,h,num;
		float atri;
		double acir;
		System.out.println("Enter the operation from the following menu");
		System.out.println("1.Area of Rectangle \n 2.Area of Circle \n 3.Area Of Square \n 4.Area Of Triangle");
		num=sc.nextInt();
		
		
		switch(num)
		{
		case 1:
			l=sc.nextInt();
			b=sc.nextInt();
			arec=l*b;
			System.out.println("Area Of Rectangle = "+arec);
			break;
		case 2:
			r=sc.nextInt();
			acir=3.14*r;
			System.out.println("Area Of Circle = "+acir);
			break;
		case 3:
			side=sc.nextInt();
			asqu=side*side;
			System.out.println("Area Of square = "+asqu);
			break;
		case 4:
			base=sc.nextInt();
			h=sc.nextInt();
			atri=(base*h)/2;
			System.out.println("Area Of Triangle = "+atri);
			break;
		default:
			System.out.println("invalid");
			
			
		}
		
		
		

	}

}
