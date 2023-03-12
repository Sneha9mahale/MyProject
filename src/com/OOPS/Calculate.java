package com.OOPS;

public class Calculate {
	
	public int add(int x,int y)
	{
		return x+y;
	}
	public void subs(int x,int y)
	{
		int s=x-y;
		System.out.println("Substraction = "+s);
	}
	public float multi(float a,float b)
	{
		return a*b;
	}
	public void division(int p,int q )
	{
		int d=p/q;
		System.out.println("Division = "+d);
	}
	public static void main(String[] args) {
		Calculate c=new Calculate();
		int ans=c.add(3,15);
		System.out.println("Addition = "+ans);
		c.subs(30, 13);
		float result=c.multi(12, 2);
		System.out.println("Multiplication ="+result);
		c.division(20, 5);

	}

}
