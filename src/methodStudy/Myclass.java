package methodStudy;

public class Myclass {

	public static void main(String[] args)
	{
		System.out.println("Main method started");
		display();
		sub(); // calling static sub method from same class
		// to call static method from another class
		//syntsx is --> classname.methodname 
        Yourclass.wish(); //calling static method from another class
        sideclass.test(); //callig static method from another class
        System.out.println("Min method is finish");
	}
	public static void display()
	{
		System.out.println("Hye I am static regular display method from same same class ");
	}
	
	public static void sub()
	{
		int a=100,b=20;
		int subs=a-b;
		System.out.println("Sub is "+subs);
		
	}
	

}
