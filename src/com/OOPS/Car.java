package com.OOPS;

public class Car {

	int id,price;
	String name,colour;
	public static void main(String[] args) {
		Car cr;
		cr=new Car();
		cr.id = 11;
		cr.price = 130000;
		cr.name = "Renault";
		cr.colour = "Black";
		System.out.println(cr.id+" "+cr.price+" "+cr.name+" "+cr.colour);
	}
}
