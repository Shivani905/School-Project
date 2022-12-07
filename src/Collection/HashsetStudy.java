package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetStudy 
{

	public static void main(String[] args) 
	{
		HashSet<Object>hs=new HashSet<>();
		
		//System.out.println(hs.add("Pune"));
		//System.out.println(hs.add("Pune"));
		hs.add("shivani");
		hs.add("dolly");
		hs.add(12345);
		hs.add('M');
		hs.add(12.36f);
		hs.add(true);
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs);
		System.out.println(hs.size());
		//hs.clear();
		//System.out.println(hs);
		//System.out.println(hs.isEmpty());
		
		Object h1 = hs.clone();
		System.out.println(h1);
		System.out.println(hs.contains("shivani"));
		System.out.println(hs.equals(h1));
		
		System.out.println("==========for loop====================");
		
		for(Object l:hs)
		{
			System.out.println(l);
		}
		
		System.out.println("=============iterator=============");
		
		Iterator<Object> it = hs.iterator();
				
				while(it.hasNext())
				{
					System.out.println(it.next());
				}
		

	}

}
