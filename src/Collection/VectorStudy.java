package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class VectorStudy
{

	public static void main(String[] args)
	{
			Vector<Object> v = new Vector<>();
			
			v.add("Hi");
			v.add('M');
			v.add(123);
			v.add(true);
			v.add(null);
			v.add(null);
			v.add("Hi");
			v.add(123.456f);
			
			
			System.out.println(v);
			
			System.out.println(v.get(3));
			System.out.println(v.remove(1));
			System.out.println(v);
			
			System.out.println(v.contains("Hi"));
			System.out.println(v.capacity());
			System.out.println(v.size());
			
			v.add("Hello");
			v.add(false);
			v.add('M');
			v.add(100);
			v.add(2545);
			v.add('k');
			
			System.out.println(v);
			System.out.println(v.capacity());
			System.out.println(v.size());
			
			//for loop, for each , iterator, listIterator, enumeratation
			
			System.out.println("=============for loop===================");
			
			for(int i=0;i<=v.size()-1;i++)
			{
				System.out.println(v.get(i));
			}
			
			System.out.println("===============for each=================");
			
			
			
			for(Object c:v)
			{
				System.out.println(c);
			}
			
			System.out.println("==================Iterator=================");
			
			Iterator<Object> vt = v.iterator();
			
			while(vt.hasNext())
			{
				System.out.println(vt.next());
			}
			
			
			System.out.println("===========ListIterator====================");
			
			ListIterator<Object> vi = v.listIterator();
			
			while(vi.hasNext())
			{
				System.out.println(vi.next());
			}
			
			System.out.println("========Enumeration============");
			 
			Enumeration<Object> ve = v.elements();
			
			while(ve.hasMoreElements())
			{
				System.out.println(ve.nextElement());
			}
			
			
						

	}

}
