package constracterWithPrameter;

public class Construter1 
{
	public static void main(String[] args) 
	{
	  Construter1 c1 = new Construter1(200, 50)	;
	  c1.add();
	}
	int a,b,c;
	public Construter1(int num1,int num2)
	{
		a= num1;
		b= num2;
		
	}
	public void add()
	{
		int sum = a+b;
		System.out.println("sum is "+sum);
	}

}
