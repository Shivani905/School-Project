package patternProgram;

public class eg5 
{

	public static void main(String[] args) 
	{
		//*****
		// ****
		//  ***
		//   **
		//    *
		
		//row=5 columns/star=5  space=0
		
		int star=5;
		int space=0;
		
		//outer for loop for rows -->1-->5
		
		for(int i=1;i<=5;i++)
		{
			
			//for loop for space
			
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			
			//for loop for star
			
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star--;
			space++;
		}
		
		 

	}

}
