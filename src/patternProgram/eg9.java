package patternProgram;

public class eg9
{

	public static void main(String[] args) 
	{
		
		//   *
		//  * *
		// * * *
		//* * * *
		
		//row=4; space=3;star=1
		
		int space=3;
		int star=1;
		
		//outer loop for rows
		
		for(int i=1;i<=4;i++)
		{
			//for loop for space
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			
			//for loop for star
			for(int k=1;k<=star;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star++;
			space--;
		}
		

	}

}
