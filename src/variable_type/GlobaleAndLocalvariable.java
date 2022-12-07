package variable_type;

public class GlobaleAndLocalvariable 
{
	int x=10;
	static int y=63;


	public static void main(String[] args)
	{
		GlobaleAndLocalvariable gl =new GlobaleAndLocalvariable();
		System.out.println("Static method and variable output");
		add(); //static method call
		System.out.println("Non-static global x value is: "+gl.x);
		int sum= y+gl.x;
		System.out.println("Addition of global Static and non-static variable is: "+sum);
        System.out.println("Non-static method and variable output");
		gl.sub(); //non-static method call
         System.out.println("Static global y variable is: "+y);
         int subs = y-gl.x;
         System.out.println("Substation of global static and nonstatic is "+subs);
         
	}
	 public static void add()
	 {
		 int a=10,b=50;
		 int add= a+b;
		 System.out.println("The addition is: "+add);
	 }
	 
	 public void sub()
	 {
		 int a=85,b=65;
		 int sub=a-b;
		 System.out.println("The substation is:  "+sub);
	 }

}
