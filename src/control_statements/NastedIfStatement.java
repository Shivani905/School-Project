package control_statements;

public class NastedIfStatement
{

	public static void main(String[] args) 
	{
		String card= "Debit card";
		int pin=1324;
		
		if(card=="Debit card")
		{
		  System.out.println("Please enter the pin:");
		
		   if(pin==1234)
		     {
			   System.out.println("Your pin is correct and transaction is succesful:");
		     }
		    else
		     {
			  System.out.println("please the correct pin:");
		     }
		} 
		else
		{
			System.out.println("please check your card:");
		}

	}

}


