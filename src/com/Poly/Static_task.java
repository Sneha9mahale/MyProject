package com.Poly;

public class Static_task {
	static int x=30;
	int y=20;
	static void put()
	{
		Static_task t1=new 	Static_task();
		System.out.println(x+" "+t1.y);
		int s=x+t1.y;
		System.out.println("addition :"+s);
	}

	public static void main(String[] args) {
		Static_task.put();
		

	}

}
