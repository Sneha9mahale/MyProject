package com.Poly;

class Vehicle
{
	public void move()
	{
		System.out.println("Vehicle is move");
	}
}
class Car extends Vehicle
{
	public void move()
	{
		super.move();
		System.out.println("Car move horizontally on road");
	}
}
class Helicopter extends Vehicle
{
	public void move()
	{
		System.out.println("Helicopter move Vertically on Sky");
	}
}
public class DynamicPoly {

	public static void main(String[] args) {
		Vehicle v=new Car();
		v.move();
		v=new Helicopter();
		v.move();

	}

}
