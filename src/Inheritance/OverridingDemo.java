package Inheritance;

class Banking
{
	protected void doTransaction()
	{
	System.out.println("Transaction through debt Bank ");
	}
}
class OnlineBanking extends Banking
{
	public void doTransaction()
	{
		super.doTransaction();
		System.out.println("Transaction Through Online ");
	}
	public void display()
	{
		System.out.println("Display method");
		super.doTransaction();
	}
}
public class OverridingDemo {

	public static void main(String[] args) {
		OnlineBanking o=new OnlineBanking();
		o.doTransaction();
		o.display();
	}

}
