package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudyEgg2 
{

	public static void main(String[] args) 
	{
		ArrayList<Character>al = new ArrayList<>();
		//ArrayList<Integer>al1 = new ArrayList<>();
		
		
		al.add('A');
		al.add('B');
		al.add('C');
		al.add('D');
		al.add('E');
		al.add('F');
		
		System.out.println(al);
		
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(3));
		System.out.println(al.get(4));
		System.out.println(al.get(5));
		
		System.out.println("============for loop(static)=========");
		//=================================for loop (static)==================
		
		
		for(int i=0;i<=5;i++)
		{
			System.out.println(al.get(i));
		}
		
		
		System.out.println("============for loop(Dyanamic)=========");
		//=================================for loop (Dyanamic)==================
		
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		
		
		System.out.println("============for loop(each)=========");
		//=================================for loop (each)==================
		
		
		for(Character a:al)
		{
			System.out.println(al.get(a));
		}
		
		//=========================Iterator===============================
		
		Iterator<Character>it = al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("===========List iterator====================");
		//===========================List iterator=======================
		
		ListIterator<Character> li = al.listIterator();
		
		
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		
		
		
		
		
		
		
		

	}

}
