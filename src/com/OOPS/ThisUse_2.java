package com.OOPS;

public class ThisUse_2 {

	public void show()
	{
		System.out.println("Hello show case:");
	}
	public void display()
	{
		System.out.println("Hello Display case:");
		this.show();
	}
	public static void main(String[] args) {
		ThisUse_2 use=new ThisUse_2();
		//use.display();
		use.show();
		use.display();
		

	}

}
