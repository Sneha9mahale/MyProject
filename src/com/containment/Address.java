package com.containment;

public class Address {
	int pin;
	String society,city;
	
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getSociety() {
		return society;
	}
	public void setSociety(String society) {
		this.society = society;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	Address(int pin,String society,String city)
	{
		System.out.println("Para Constructor Of Address");
		this.pin=pin;
		this.society=society;
		this.city=city;
	}
	public void showAddress()
	{
		System.out.println("Pin No : "+pin+"Society Name : "+society+" City Name : "+city);
	}

	

}
