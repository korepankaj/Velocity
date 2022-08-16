package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_homogenious {

	public static void main(String[] args) 
	{
	   Vector<Character> vc = new Vector<>();
       
	   vc.add('A');
	   vc.add('B');
	   vc.add('C');
	   vc.add('D');
	   vc.add('E');
	   vc.add('F');
	   vc.add('G');
	   vc.add('H');
	   
	   System.out.println("Displayt all values");
	   System.out.println(vc);
	   System.out.println();
	   
	   System.out.println("Display all values by using static for loop");
	   for(int i=0; i<=7; i++)
	   {
		   System.out.println(vc.get(i));
	   }
	   
	   System.out.println();
	   
	   System.out.println("Display all values by using dynamic for loop");
	   for(int i=0; i<vc.size(); i++)
	   {
		   System.out.println(vc.get(i));
	   }
	   
	   System.out.println();
	   
	   System.out.println("Display all values by using for each loop");
	   for( Character pk : vc)
	   {
		   System.out.println(pk);
	   }
	   
	   System.out.println();

	   System.out.println("Display all values by using Iterator");
	   
	   Iterator<Character> kp = vc.iterator();
	    
	   while(kp.hasNext())
	   {
	      System.out.println(kp.next());
	   }
	   
	   System.out.println();
	   
	   System.out.println("Display all values by using ListIterator");
	   
	   ListIterator<Character> pk = vc.listIterator();
	   
	   while(pk.hasNext())
	   {
		   System.out.println(pk.next());
	   }
	   
	   System.out.println();
	   
	   System.out.println("Display all values by using Enumeration");
	   Enumeration<Character> sp = vc.elements();
	   
	   while(sp.hasMoreElements())
	   {
		   System.out.println(sp.nextElement());
	   }
	   
//	   ListIterator<Character> remove = vc.listIterator();
//	   
//	   while(remove.hasNext())
//	   {
//		   System.out.println(remove.remove());
//	   }
	   
	}

}