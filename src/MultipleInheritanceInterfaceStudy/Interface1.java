package MultipleInheritanceInterfaceStudy;

public interface Interface1
{
	void m1();
	void m2();
	default void demo()
	{
		System.out.println("I am a demo method from Interface1");
	}
	

}
