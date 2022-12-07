package Array;

public class array_study 
{

	public static void main(String[] args)
	{
		int no[] = new int[3];  //array declaration
		
		no[0]=10;
		no[1]=20;
		no[2]=30;  //array initialization
		
		System.out.println(no[0]=10);
		System.out.println(no[1]=20);
		System.out.println(no[2]=30); //usage
		System.out.println("==================");
		
		for(int i=0;i<=2;i++)           //static for loop
		{
			System.out.println(no[i]);
		}
		System.out.println("========================");
		
		for(int i=0;i<=no.length-1;i++)      //dynamic for loop
		{
			System.out.println(no[i]);
		}
		System.out.println("=========================");
		
		for(int i=no.length-1;i>=0;i--)   //reverse order
		{
			System.out.println(no[i]);	
		}
		
		
		

	}

}
