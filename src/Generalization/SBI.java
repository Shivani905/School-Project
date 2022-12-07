package Generalization;

public class SBI implements RBI
{

	@Override
	public void deposit() 
	{
		System.out.println("SBI deposit");
		
	}

	@Override
	public void balance_check()
	{
		System.out.println("SBI balance_check");
		
	}

	@Override
	public void transfer() 
	{
		System.out.println("SBI transfer");
		
	}

	@Override
	public void withDraw() 
	{
		System.out.println("SBI withDraw");
		
	}
	void yono()
	{
		System.out.println("YONO servise");
	}

}
