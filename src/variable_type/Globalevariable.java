package variable_type;

public class Globalevariable 
{
	//Global non-static variable                
	int a=50;                                
	float b=30.55f;
	char c='d';
	static String str="Shiu";  //global static variable
	boolean answer= true;
	
	public static void main(String[] args)  //main method
	{
	   Globalevariable gl = new Globalevariable(); //object of same class
	   System.out.println("Global non-static with int variable : "+gl.a);
	   System.out.println("Global non-static with float variable : "+gl.b);
	   System.out.println("Global non-static with char variable : "+gl.c);
	   System.out.println("Global non-static with string variable : "+str);
	   System.out.println("Global non-static with boolean variable : "+gl.answer);
	   
	}

}
