package thisAndSuperKeyword;

public class SuperUse extends ThisUse
{
  int a=50; //Globale variable a
	public static void main(String[] args)
	{
      SuperUse s = new SuperUse();
      s.demo();

	}
	public void demo()
	{
		int a=70; //Local variable a
		int sum=a+20;
		int sum1=this.a+40;
		int sum2=super.a+10;
		System.out.println("sum  "+sum);
		System.out.println("sum1 "+sum1);
		System.out.println("sum2 "+sum2);
	}

}
