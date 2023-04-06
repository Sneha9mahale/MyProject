package Encapsulation;

public class Hotel {
	private int id;
	private String name;
	private String location;
	private double rating;
	private boolean isOnlineorderAvailable;
	private String seatingCapacity;
	private String paymentType;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{		this.name=name;
	}
	public void setLocation(String location)
	{
		this.location=location;
	}
	public void setRating(double rating)
	{
		this.rating=rating;
	}
	public void setIsOnlineorderAvailable(boolean isOnlineorderAvailable)
	{
		this.isOnlineorderAvailable=isOnlineorderAvailable;
	}
	public void setSeatingCapacity(String seatingCapacity)
	{
		this.seatingCapacity=seatingCapacity;
	}
	public void setPaymentType(String paymentType)
	{
		this.paymentType=paymentType;
	}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public String getLocation()
	{
		return location;
	}
	public double getRating()
	{
		return rating;
	}
	public boolean getIsOnlineorderAvailable()
	{
		return isOnlineorderAvailable;
	}
	public String getSeatingCapacity()
	{
		return seatingCapacity;
	}
	public String getPaymentType()
	{
		return paymentType;
	}

	public static void main(String[] args) {
		Hotel h=new Hotel();
		h.setId(11);
		h.setName("Sai Hotel");
		h.setLocation("Pune");
		h.setRating(10000);
		h.setIsOnlineorderAvailable(true);
		h.setSeatingCapacity("minimun 12");
		h.setPaymentType("Online or offline");
		
		System.out.println(h.getId()+" "+h.getName()+" "+h.getLocation()+" "+h.getRating()+" "+h.getIsOnlineorderAvailable()+" "+h.getSeatingCapacity()+" "+h.getPaymentType());
	}

}
