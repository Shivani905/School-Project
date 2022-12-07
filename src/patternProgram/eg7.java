package patternProgram;

public class eg7
{

	public static void main(String[] args) 
	{
		
		//   *
		//  ***
		// *****
		//*******
		
		//row=4 space=3 star=1
		
		int star=1;
		int space=3;
		
		//outer loop for rows
		for(int i=1;i<=4;i++)
		{
			//inner loop for space
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			//loop for star
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star=star+2;
			space--;
		}

	}

}
