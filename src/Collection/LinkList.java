package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class LinkList 
{

	public static void main(String[] args)
	{
		LinkedList<Object>AQ = new LinkedList<>();
		AQ.add(123);
		AQ.add("CLASS");
		AQ.add(true);
		AQ.add(null);
		AQ.add(123.14f);
		AQ.add(null);
		AQ.add('M');
		AQ.add(123);
		AQ.add(true);
		
		System.out.println(AQ);
		
		
		System.out.println(AQ.get(2));
		System.out.println(AQ);
		System.out.println(AQ.getFirst());
		System.out.println(AQ);
		System.out.println(AQ.getLast());
		System.out.println(AQ);
		System.out.println(AQ.size());
		System.out.println(AQ);
		//System.out.println(AQ.isEmpty());
		System.out.println(AQ);
		//System.out.println(AQ.peek());
		System.out.println(AQ);
		//System.out.println(AQ.peekFirst());
		System.out.println(AQ);
		//System.out.println(AQ.peekLast());
		System.out.println(AQ);
		//System.out.println(AQ.poll());
		System.out.println(AQ);
		//System.out.println(AQ.pollFirst());
		System.out.println(AQ);
		//System.out.println(AQ.pollLast());
		System.out.println(AQ);
		//System.out.println(AQ.remove());
		System.out.println(AQ);
		//System.out.println(AQ.removeFirst());
		System.out.println(AQ);
		//System.out.println(AQ.removeLast());
		
		
		System.out.println("================For Each======================");
		for(Object F:AQ)
		{
			System.out.println(F);
		}
		
		System.out.println("============Iterator==============");
		Iterator<Object>R= AQ.iterator();
		while(R.hasNext())
		{
			System.out.println(R.next());
		}
		
		System.out.println("============ListIterator==============");
		ListIterator<Object>E=AQ.listIterator();
		while(E.hasNext())
		{
			System.out.println(E.next());
		}
		

	}

		
	}


