package Encapsulation;

public class MovieThis {
	int yearOfRelease;
	float profit;
	String actorName,movieName;
	MovieThis()
	{
		//this(2022,70000000.0f,"Alia bhatt","RRR");
		this(2022,700000.0f);
		actorName="Alia";
		movieName="RRR";
//		yearOfRelease=1999;
//		profit=150000.0f;
//		actorName="Mr.James";
//		movieName="Titanic";
	}
	MovieThis(int yearOfRelease,float profit)
	{
		this.yearOfRelease=yearOfRelease;
		this.profit=profit;
	}
	MovieThis(int yearOfRelease,float profit,String actorName,String movieName)
	{
		this.yearOfRelease=yearOfRelease;
		this.profit=profit;
		this.actorName=actorName;
		this.movieName=movieName;
	}
	void acceptDetails(int yearOfRelease,float profit,String actorName,String movieName)
	{
		this.yearOfRelease=yearOfRelease;
		this.profit=profit;
		this.actorName=actorName;
		this.movieName=movieName;
		this.showDetails();
	}
	void showDetails()
	{
		System.out.println("Movie Name : "+movieName);
		System.out.println("Year Of Release Movie : "+yearOfRelease);
		System.out.println("Actor Name : "+actorName);
		System.out.println("Profit Earned : "+profit);
	}

	
	public static void main(String[] args) {
		MovieThis m=new MovieThis();
		m.showDetails();
//		MovieThis u=new MovieThis(2020,400000.0f,"akshay kumar","Lakshmi");
//		u.showDetails();
//		m.acceptDetails(2022, 10000000.0f,"Salman Khan","sultan");

	}

}

