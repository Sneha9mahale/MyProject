package Encapsulation;

public class Movie {
	int yearOfRelease;
	float profit;
	String actorName,movieName;
	Movie()//Default Constructor
	{
		yearOfRelease=1999;
		profit=150000.0f;
		actorName="Mr.James";
		movieName="Titanic";
	}
	Movie(int yr,float pr,String an,String mn)//Parameterised Constructor
	{
		yearOfRelease=yr;
		profit=pr;
		actorName=an;
		movieName=mn;
	}
	void showDetails()
	{
		System.out.println("Movie Name : "+movieName);
		System.out.println("Year Of Release Movie : "+yearOfRelease);
		System.out.println("Actor Name : "+actorName);
		System.out.println("Profit Earned : "+profit);
	}

	public static void main(String[] args)  {
		Movie m=new Movie();
		m.showDetails();
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		Movie u=new Movie(2021,2000000.0f,"Vicky Kaushal","Uri");
		u.showDetails();

	}

}
