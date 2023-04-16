package Inheritance;
//Hierarchical Inheritance
class vicePresident extends Employee1
{
	float allowance;

	public float getAllowance() {
		return allowance;
	}

	public void setAllowance(float allowance) {
		this.allowance = allowance;
	}
	public void showVPDetails()
	{
		showDetails();
		System.out.println("VP president Allowance : "+allowance);
	}
}
public class PayRollApplication {

	public static void main(String[] args) {
		vicePresident v=new vicePresident();
		v.getDetails(1, "Mr.x",34500.42f);
		v.setAllowance(4.5f);
		v.showVPDetails();
		Manager m=new Manager();
		m.getDetails(2, "Mr.Y",4568.0f);
		m.setIrate(3.4f);
		m.showManagerDetails();
	}

}
