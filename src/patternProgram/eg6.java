package patternProgram;

public class eg6
{

	public static void main(String[] args) 
	{
      
		//    *
		//   **
		//  ***
		// ****
		//*****
		
		//rows=5 columns=max num 5
		
		//outer for loop for rows
		
		int space=4 ;
		int star=1;
		
		for(int i=1;i<=5;i++)
		{
			//loop for space
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
			space--;
			star++;
		}
	}

}
