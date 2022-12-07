package Collection;

import java.util.ArrayList;

public class ArrayListStudyEgg1
{

	public static void main(String[] args)
	{
ArrayList al = new ArrayList();
		
		al.add("Velocity");
		al.add(123);
		al.add('M');
		al.add("Velocity");
		al.add(123.1254f);
		al.add(null);
		al.add(null);
		al.add(true);
		al.add(false);
		
		System.out.println(al);
		
		al.add(2, "Shivani");
		System.out.println(al);
		
		System.out.println(al.size());
		
		System.out.println(al.contains("PUNE"));
		
		System.out.println(al.contains("Velocity"));
		
		System.out.println(al.isEmpty());
		
		System.out.println(al.remove(true));
		
		System.out.println(al);
		
		System.out.println(al.remove(0));
		
		System.out.println(al);
		
		//al.clear();
		
		System.out.println(al);
		
		for(Object m:al)
		{
			System.out.println(m);
		}



	}

}
