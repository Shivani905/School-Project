package Generalization;

public class BOI implements RBI
{

	@Override
	public void deposit() 
	{
		System.out.println("BOI deposit");
		
	}

	@Override
	public void balance_check()
	{
		System.out.println("BOI balance_check");
		
	}

	@Override
	public void transfer() 
	{
		System.out.println("BOI transfer");
		
	}

	@Override
	public void withDraw() 
	{
		System.out.println("BOI withDraw");
		
	}
	
	void goodservise()
	{
		System.out.println("Servise policy");
	}

}
