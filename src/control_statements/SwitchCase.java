package control_statements;

public class SwitchCase {

	public static void main(String[] args) 
	{
		String month="Jan";
		 
		switch (month)
       {
		case "Jan": System.out.println("This is the first month of year");
	    break;
		case "feb": System.out.println("This is the second month of year");
		break;
		case "march": System.out.println("This is the third month of year");
		break;
		case "april": System.out.println("This is the forth month of year");
		break;
		case "may": System.out.println("This is the fifth month of year");
		break;
		case "june": System.out.println("This is the sixth month of year");
		break;
		case "july": System.out.println("This is the seenth month of year");
		break;
		case "august": System.out.println("This is the eighth month of year");
		break;
		case "sept": System.out.println("This is the nineth month of year");
		break;
		case "oct": System.out.println("This is the tenth month of year");
		break;
		case "nov": System.out.println("This is the eleventh month of year");
		break;
		case "dec": System.out.println("This is the twellth month of year");
		break;

		default: System.out.println("Please enter correct month value between jan to dec");
	    break;
		}
	}

}
