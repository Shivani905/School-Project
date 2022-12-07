package AccessSpecifier;

public class class1
{
	//globale non-static variable declaration & initialization
	private int a=10;
	int b=20;
	protected int c=30;
	public int d=40;
	
   //main method
	public static void main(String[] args) 
	{
		class1 c1= new class1();
		System.out.println("Private Globale non-static variable a"+c1.a);
		System.out.println("Default Globale non-static variable a"+c1.b);
		System.out.println("Protected Globale non-static variable a"+c1.c);
		System.out.println("Public Globale non-static variable a"+c1.d);
		System.out.println("===========================================");
		
		//non static method calling
		c1.test1();
		c1.test2();
		c1.test3();
		c1.test4();
	}
	
	//non static methods
	private void test1()  //private non-static method
	{
		System.out.println("I am private test1 method from class1");
	}
	void test2()   //Default non-static method
	{
		System.out.println("I am default test2 method from class1");	
	}
	protected void test3()  //protected non-static method
	{
		System.out.println("I am protected test3 method from class1");	
	}
	public void test4()   //public non-static method
	{
		System.out.println("I am public test4 method from class1");	
	}

}
