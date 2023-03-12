package com.Poly;

public class Overload_area {
	public void area(int r)
	{
		System.out.println("Area Of Circle : ");
		float ac=3.142f*r*r;
		System.out.println(ac);
	}
	public void area(int l,int b)
	{
		System.out.println("Area Of rectangle : ");
		int ar=l*b;
		System.out.println(ar);
	}
	public void area(float b,int h)
	{
		System.out.println("Area Of Triangle : ");
		float at=b*h/2;
		System.out.println(at);
	}
	public void area(float s)
	{
		System.out.println("Area Of Square :");
		float as=s*s;
		System.out.println(as);
	}

	public static void main(String[] args) {
		Overload_area a=new Overload_area();
		a.area(2);
		a.area(4,6);
		a.area(2.0f,5);
		a.area(4.0f);
		
	}

}
