package patternProgram;

public class eg2
{

	public static void main(String[] args) 
	{
		//* * * *
		//* * * *
		//* * * *
		//* * * *
		//* * * *
		
		//row=5 columns=5
		
		//outer for loop -->for rows-->1-->5
		for(int i=1;i<=5;i++)
		{
			//inner for loop-->for columns-->1-->5
			for(int j=1;j<=5;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
