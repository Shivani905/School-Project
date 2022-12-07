package control_statements;

public class ElseIfUse {

	public static void main(String[] args)
	{
		String month= "Jan";
		if(month=="Jan")
		{
			
			System.out.println("I am 1st month of year");
		}
		else if (month == "june")
		{
			System.out.println("I am 6th month of year");
		}
		else
		   System.out.println("Please enter correct month");
	}

}
