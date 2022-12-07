package interfaceStudy;

public class IC1 implements I2
{

	public static void main(String[] args)
	{
	  IC1 i = new IC1();
	  i.sample1();
	  i.sample2();
	  i.sample3();
	  i.sample4();

	}

	@Override
	public void sample1() 
	{
		System.out.println("sample1 from I1 interface");
		
	}

	@Override
	public void sample2() 
	{
		System.out.println("sample2 from I1 interface");
		
	}

	@Override
	public void sample3() 
	{
		System.out.println("sample3 from I2 interface");
		
	}

	@Override
	public void sample4()
	{
		System.out.println("sample4 from I2 interface");
		
	}

}
