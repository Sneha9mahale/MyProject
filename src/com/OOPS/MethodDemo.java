package com.OOPS;

public class MethodDemo {
	//1.No return  type no parameter
	public void show() {
		System.out.println("In show method....");
	}
	//2.no return type with parameter
	public void add(int a,int b)
	{
		int s=a+b;
		System.out.println(s);	
	}
	//3.return type with no parameter
	public int mul()
	{
		int a1=5;
		int b1=10;
		int c=a1*b1;
		return c;
	}
	
	//4.return type with parameter
	public double areaOfCircle(int r,double PI)
	{
		double area=PI*r*r;
		return area;
	}
	

	public static void main(String[] args) {
		
		MethodDemo m=new MethodDemo();
		m.show();
		m.add(4,5);
		int multi=m.mul();
		System.out.println(multi);
		
		double result=m.areaOfCircle(5,3.142);
		System.out.println(result);
	}

}
