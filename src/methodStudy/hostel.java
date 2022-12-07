package methodStudy;

public class hostel
{

	public static void main(String[] args) 
	{
	classroom();
	hostel h=new hostel();
	h.labrary();
	Cantine.southindianfood();
	Cantine c=new Cantine();
	c.chainise();
	
	}
	public static void classroom()
	{
		int boys=20;
		int girls=40;
		int total=boys+girls;
		System.out.println("Strength of classroom is "+total);
    }
	public void labrary()
	{
		int sold=50;
		int total=4000;
		int balance=total-sold;
		System.out.println("Balance book is "+balance);
	}
}
