package Collection;

import java.util.TreeSet;

public class TreeSetStudy 
{

	public static void main(String[] args)
	{
		TreeSet<Object> ts = new TreeSet<>();
		
		ts.add(7);
		ts.add(1);
		ts.add(8);
		ts.add(6);
		ts.add(78);
		ts.add(10);
		ts.add(10);
		
		System.out.println(ts);
		
		System.out.println(ts.first());
		System.out.println(ts.higher(4));
		System.out.println(ts.lower(5));
		System.out.println(ts.floor(1));
		
		

	}

}
