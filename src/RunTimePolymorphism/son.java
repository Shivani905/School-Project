package RunTimePolymorphism;

public class son extends Father
{

	public static void main(String[] args) 
	{
	   Father f = new Father();
	   son s    = new son();
	   f.nature();
	   s.nature();

	}
	public void nature()
	{
		System.out.println("son's nature method");
	}
	public void test()
	{
		System.out.println("son's Test method ");
	}

}
