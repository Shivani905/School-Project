package Casting;

public class Upcasting
{

	public static void main(String[] args) 
	{
		Father f = new Father();
		f.money();
		f.home();
		
		son s = new son();
		s.money();
		s.home();
		s.sharemarket();
		
		Father f1 = new son();
		f1.money();
		f1.home();
		// we can't call sharemarket() method using father refrence
		

	}

}
