package com.containment;

public class Menu {
	int mid;
	String itom;
	float price;
	

	public int getId() {
		return mid;
	}


	public void setId(int mid) {
		this.mid = mid;
	}


	public String getItom() {
		return itom;
	}


	public void setItom(String itom) {
		this.itom = itom;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}

	Menu(int mid,String itom,float price)
	{
		System.out.println("Para Const Of Menu");
		this.mid=mid;
		this.itom=itom;
		this.price=price;
	}
	public void showMenu()
	{
		System.out.println("Id : "+mid+" Itom : "+itom+" Price : "+price);
	}

}
