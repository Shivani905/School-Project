package patternProgram;

public class eg11
{

	public static void main(String[] args) 
	{
		//*****
		//****
		//***
		//**
		//*
		//**
		//***
		//****
		//*****
		
		//rows=9 star=5
		
		//outer loop for rows
		
		int star=5;
		
		for(int i=1;i<=9;i++) 
		{
			//inner loop star
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			if(i<5)
			{
				star--;
			}
			else
			{
				star++;
			}
			
		}

	}

}
