package MultipleInheritanceInterfaceStudy;

public class IC implements Interface1 , Interface2
{

	public static void main(String[] args) 
	{
		IC i = new IC();
		i.m1();
		i.m2();
		i.m3();
		i.m4();

	}

	@Override
	public void m3()
	{
		System.out.println("m3 mehod from Interface2");
		
	}

	@Override
	public void m4() 
	{
		System.out.println("m4 mehod from Interface2");
		
	}

	@Override
	public void m1() 
	{
		System.out.println("m1 mehod from Interface1");
		
	}

	@Override
	public void m2() 
	{
		System.out.println("m2 mehod from Interface1");
		
	}

	@Override
	public void demo()
	{
		Interface2.super.demo();
		Interface1.super.demo();
	}
	

}
