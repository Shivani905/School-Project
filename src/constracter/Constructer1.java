package constracter;

public class Constructer1
{

	public static void main(String[] args) 
	{
	  Constructer1 c = new Constructer1();
	  c.sub();

	}
	 int a,b;
	 public Constructer1()  //non static 
     {
   	  a=100;
   	  b=20;
     }
      public void sub()
      {
    	 int sub = a-b; 
    	 System.out.println("The sub is "+sub);
      }
      
     
      
}


      

