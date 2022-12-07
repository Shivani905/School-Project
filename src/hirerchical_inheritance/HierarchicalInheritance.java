package hirerchical_inheritance;

public class HierarchicalInheritance {

	public static void main(String[] args)
	{
		Parent p = new Parent();
		p.mom();
		
		child1 c1 = new child1();
		c1.mom();
		c1.toys();
		
		Child2 c2 = new Child2();
		c2.mom();
		c2.hobies();
		
		
		

	}

}
