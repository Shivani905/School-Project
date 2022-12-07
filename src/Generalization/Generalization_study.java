package Generalization;

public class Generalization_study 
{

	public static void main(String[] args)
	{
		SBI s = new SBI();
		BOI b = new BOI();
		
		System.out.println(RBI.Zerobalance);
		
		s.deposit();
		s.balance_check();
		s.transfer();
		s.withDraw();
		s.yono();
		
		System.out.println("===================================");
		
		b.deposit();
		b.balance_check();
		b.transfer();
		b.withDraw();
		b.goodservise();
		

	}

}
