package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetStudy 
{

	public static void main(String[] args)
	{
		LinkedHashSet<Integer>h=new LinkedHashSet<>();
		h.add(1);
		h.add(25);
		h.add(4);
		h.add(4);
		h.add(63);
		h.add(null);
		h.add(null);
		h.add(51);
		
		System.out.println(h);
		System.out.println(h.clone());
		System.out.println(h.size());
		System.out.println(h.contains(4));
		System.out.println(h.isEmpty());
		
		System.out.println("======================for each loop===================");
		
		for(Integer f1:h)
		{
			System.out.println(f1);
		}
		
		System.out.println("===================Iterator============");
		
		Iterator<Integer> it = h.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
