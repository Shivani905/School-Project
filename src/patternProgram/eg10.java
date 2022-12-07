package patternProgram;

public class eg10 
{

	public static void main(String[] args)
	{
		// ****
        //  ***
		//   **
		//    *
		
		int star=4;
		int space=0;
		
		//outer loop for rows
		
		for(int i=1;i<=4;i++)
		{
			//inner for loop
			//loop for space
			for(int j=0;j<=space;j++)
			{
				System.out.print(" ");
			}
			
			//loop for star
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			space++;
			star--;
		}
	}

}
