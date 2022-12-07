package String_Consept;

public class ArrayStudy2
{

	public static void main(String[] args)
	{
		String name[]={"Shivani","Prathmesh","Nyesha"};
		
		for(int i=0;i<=name.length-1;i++)
		{
			System.out.println(i);
		}
		System.out.println("==========================");
		
		
		for(int i=name.length-1;i>=0;i--)
		{
			System.out.println(name[i]);
		}
	}

}
