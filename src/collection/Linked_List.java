package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linked_List {

	public static void main(String[] args) 
	{
		LinkedList ll = new LinkedList();
		
		 ll.add("Velocity");
	     ll.add(200);
	     ll.add(100.99);
	     ll.add(null);
	     ll.add(true);
	     ll.add("Velocity");
	     ll.add('Z');
	     ll.add(null);
	     ll.add("Pankaj");
	     ll.add('B');
	     ll.add(99.99);
	     
	     System.out.println("Display all values");
	     System.out.println(ll);
	     System.out.println();
	     
	     System.out.println("Display size");
	     System.out.println(ll.size());
	     System.out.println();
	     
	     System.out.println("Retrives but does not removes \\ Display first element of the list");
	     System.out.println(ll.peek());
	     System.out.println(ll);
	     System.out.println();
	     
	     System.out.println("Retrives but does not removes \\ Display last element of the list\"");
	     System.out.println(ll.peekLast());
	     System.out.println(ll);
	     System.out.println();
	     
	     System.out.println("Retrives and removes the element");
	     System.out.println(ll.poll());
	     System.out.println(ll);
	     System.out.println();
	     
	     System.out.println("Retrives and removes the last element");
	     System.out.println(ll.pollLast());
	     System.out.println(ll);
	     System.out.println();
	     
	     System.out.println("Add value to the specific index");
	     ll.add(0, "Velocity");
	     System.out.println(ll);
	     System.out.println();
	     
	     System.out.println("Display all values by using for each loop");
	     
	     for( Object sp : ll)
	     {
	    	 System.out.println(sp);
	     }
	     
	     System.out.println();
	     
	     System.out.println("Display all values by using list iterator");
	     
	     ListIterator sp = ll.listIterator();
	     
	     while(sp.hasNext())
	     {
	    	 System.out.println(sp.next());
	     }
	     
	     System.out.println();
	     
	     System.out.println("Display all values by using static for loop");
	     
	     for(int i=0; i<=9; i++)
	     {
	    	 System.out.println(ll.get(i));
	     }
	     
	     System.out.println();
	     
	     System.out.println("Display all values by using dynamic for loop");
	     
	     for(int i=0; i<ll.size(); i++)
	     {
	    	  System.out.println(ll.get(i));
	     }
	     
	     System.out.println();
	     
	     System.out.println("Display all values by using iterator");
	     
	     Iterator kp = ll.iterator();
	     
	     while(kp.hasNext())
	     {
	    	 System.out.println(kp.next());
	     }
	     
	     
	     
	     
	     
	     
	     
	     
	     

	}

}
