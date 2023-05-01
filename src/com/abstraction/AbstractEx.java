package com.abstraction;

abstract class ObjectMovement
{
	int speed;
	abstract public void move(int speed);
	static String direction="forward";
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
class Car extends ObjectMovement
{
	public void move(int s)
	{
		speed=s;
		System.out.println("Now car is running with spped "+speed+" in "+direction);
	}
	public void showColour()
	{
		System.out.println("Car colour is white");
	}
}
class Ball extends ObjectMovement
{
	public void move(int s)
	{
		speed=s;
		System.out.println("Now Ball is running with spped "+speed+" in "+direction+" direction");
	}
	public void showColour()
	{
		System.out.println("ball colour is red");
	}
}
public class AbstractEx {

	public static void main(String[] args) {
		//ObjectMovement o=new Car();
		ObjectMovement o;
		o=new Car();
		o.setSpeed(40);
		System.out.println("Initial speed of car : "+o.getSpeed());
		o.move(50);
		o=new Ball();
		o.setSpeed(30);
		System.out.println("Initial speed of ball : "+o.getSpeed());
		o.move(60);
	}

}