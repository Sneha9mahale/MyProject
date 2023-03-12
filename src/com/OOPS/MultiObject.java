package com.OOPS;

class Rectangle{
	int l,b;
	void insert(int le,int w)
	{
		l=le;
		b=w;
	}
	void display()
	{
		int a=l*b;
		System.out.println(a);
	}
}
public class MultiObject {

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.insert(5,4);
		r.display();
		r.insert(6,7);
		r.display();

	}

}
