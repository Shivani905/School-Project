package patternProgram;

public class eg12 
{

	public static void main(String[] args)
	{
		//*
		//**
		//***
		//****
		//***
		//**
		//*
		
		
		//row=7 star=1
		//outer loop for row
		
		int star=1;
		
		for(int i=1;i<=7;i++)
		{
			//loop for star
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<4)
			{
				star++;
			}
			else
			{
				star--;
			}
		}
				
		

	}

}
