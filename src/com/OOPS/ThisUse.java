package com.OOPS;

public class ThisUse {

	int num;
	public void input(int num)
	{
		this.num=num;
	}
	public void display()
	{
		System.out.println(num);
	}
	public static void main(String[] args) {
		ThisUse t=new ThisUse();
		t.input(100);
		t.display();

	}

}
