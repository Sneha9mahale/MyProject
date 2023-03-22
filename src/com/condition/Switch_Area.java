package com.condition;
import java.util.Scanner;
public class Switch_Area {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int l,b,r,arec,asqu,side,base,h,num,re,peri;
		float atri;
		double acir,circum;
		System.out.println("Enter the operation from the following menu");
		System.out.println("1.Area of Rectangle \n 2.Area of Circle \n 3.Area Of Square \n 4.Area Of Right Angle Triangle  \n 5.Circumference Of circle  \n  6.Perimeter Of Square");
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
			System.out.println("Area Of Right angle Triangle = "+atri);
			break;
		case 5:
			re=sc.nextInt();
			circum=2*3.14*re;
			System.out.println("Circumference = "+circum);
			break;
		case 6:
			int len=sc.nextInt();
			int bre=sc.nextInt();
			peri=2*(len+bre);
			System.out.println("Perimeter Of Rectangle = "+peri);
			break;
		default:
			System.out.println("invalid");
			
			
		}
		
		
		

	}

}
