package patternProgram;

public class eq8 
{

	public static void main(String[] args)
	{
//		*******
//		 *****
//		  ***
//		   * 
		
		//rows=4 star=7 space=0
		
		//outer loop for rows
		
		int star=7;
		int space=0;
		
		for(int i=1;i<=4;i++)
		{
			//loop for star
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			//loop for space
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star=star-2;
			space++;
			
		}

	}

}
