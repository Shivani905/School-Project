package thisAndSuperKeyword;

public class ThisUse 
{ 
	int a=10;   //Globale variable a
	int b=500;  //Globale variable b

	public static void main(String[] args) 
	{
        ThisUse t =new ThisUse() ;
        t.add();

	}
	public   void add()
	{
		int a=30;  //Local variable a
		int sum=a+10;
		System.out.println("the sum is "+sum);
		
		int sum1=this.a+50;
		System.out.println("the sum1 is"+sum1);
	}

}
