package abstractClass;

public class B extends A
 {

	public static void main(String[] args)
	{
	  B b= new B();
	  b.m();
	  b.n();
	  b.add();
	 

	}

	@Override
	public void o() {
		// TODO Auto-generated method stub
		
	}
	  
	public void add()  //own method 
	{
		System.out.println("I am a addition function");
	}

}
