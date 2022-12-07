package Collection;

import java.util.ArrayList;

public class ArrayListStudy
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

	}

}
