package patternProgram;

public class eg4
{

	public static void main(String[] args) 
	{
		//*****
		//****
		//***
		//**
		//*
		
		//rows=5 columns(max num)=5
		
		int star=5;
		
		//outer loop for rows -->1-->5
		
		for(int i=1;i<=5;i++)
		{
			//inner loop for columns -->5-->1
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			star--;
			System.out.println();
		}
		

	}

}
