package com.OOPS;

public class Product {
	
	int price,quantity;
	String name;
		public void assignvalue(String nm,int prc,int quan)
		{
			name=nm;
			price=prc;
			quantity=quan;
		}
		public void display()
		{
			System.out.println(name+" "+price+" "+quantity);
		}
		public static void main(String[] args) {
		Product p=new Product();
		p.assignvalue("Computer",30000,2);
		p.display();
		p.assignvalue("Intel",45000,4);
		p.display();
	}
	

}
