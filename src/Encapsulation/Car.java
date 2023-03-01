package Encapsulation;

public class Car {
	private int id;
	private String name;
	private int price;
	private String colour;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public void setColour(String colour)
	{
		this.colour=colour;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getPrice()
	{
		return price;
	}
	public String getColour()
	{
		return colour;
	}
	
	public static void main(String[] args) {
		Car c=new Car();
		c.setId(11);
		c.setName("Renault");
		c.setPrice(30000);
		c.setColour("Yellow");
		
		System.out.println(c.getId()+" "+c.getName()+" "+c.getPrice()+" "+c.getColour());

	}

}
