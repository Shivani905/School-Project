package CompileTimePolymorphism;

public class compiletime 
{

	public static void main(String[] args)
	{
		add();
		add(20);
		add(10, 40);

	}
	
	public static void add ()
	{
		int a=10;
		int sum=a+10;
		System.out.println(+sum);
	}
	
	public static void add(int a)
	{
		int sum = a+1;
		System.out.println(+sum);
	}
	
	public static void add(int a,int b)
	{
		int sum = a+b;
		System.out.println(+sum);
	}
	

}
