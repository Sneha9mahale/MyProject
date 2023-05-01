package com.abstraction;

interface Moveable
{
	public void move(int speed);
	String direction="forward";
	public void showColour();
}
 class Car2 implements Moveable,Washable
{
	public void move(int s)
	{
		
		System.out.println("Now car is running with spped "+s+" in "+Moveable.direction);
	}
	public void showColour()
	{
		System.out.println("Car colour is white");
	}
	public void Wash()
	{
		System.out.println("Car is Wash");
	}
	
	
}
class Ball1 implements Moveable
{
	public void move(int s)
	{
		System.out.println("Now Ball is running with spped "+s+" in "+direction+" direction");
	}
	public void showColour()
	{
		System.out.println("ball colour is red");
	}
}
public class Interfaceex {

	public static void main(String[] args) {
		//ObjectMovement o=new Car();
		Moveable o;
		o=new Car2();
		Washable w=new Car2();
		w.wash();
		o.move(50);
		o=new Ball1();
		
		o.move(60);
	}

}


	


