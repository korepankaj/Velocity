package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_Generic {

	public static void main(String[] args) 
	{
		Vector vc = new Vector();   //created object of vector class
		
		 vc.add("Velocity");
	     vc.add(200);
	     vc.add(100.99);
	     vc.add(null);
	     vc.add(true);
	     vc.add("Velocity");
	     vc.add('Z');
	     vc.add(null);
	     vc.add("Pankaj");
	     vc.add('B');
	     vc.add(99.99);
	     
	     
	     System.out.println("Display all values");
	     System.out.println(vc);
	     System.out.println();
		
	     System.out.println("Display size of values");
	     System.out.println(vc.size());
	     System.out.println();
	     
	     System.out.println("Check case sensetive"); 
	     System.out.println(vc.contains("Pankaj"));
	     System.out.println();
	     
	     System.out.println("Remove value as per index");
	     vc.remove(0);
	     System.out.println(vc);
	     System.out.println();
	     
	     System.out.println("Remove value as per value");
	     vc.removeElement('B');
	     System.out.println(vc);
	     System.out.println();
	     
	     System.out.println("Add value to the specific index");
	     vc.add(0, "Velocity");
	     System.out.println(vc);
	     System.out.println();
	     
	     System.out.println("Display all value by using static for loop");
	     
	     for(int i=0; i<=9; i++)
	     {
	    	 System.out.println(vc.get(i));
	     }
	     
	     System.out.println();
	     
	     System.out.println("Display all value by using dynamic for loop");
	     
	     for(int i=0; i<vc.size(); i++)
	     {
	    	 System.out.println(vc.get(i));
	     }
	     
	     System.out.println();
	     
	     System.out.println("Display all values by using for each loop");
	     
	     for( Object pk : vc)
	     {
	    	 System.out.println(pk);
	     }
	     
	     System.out.println();
	     
	     System.out.println("Display all values by using iterator");
	     
	     Iterator pk = vc.iterator();
	    
	     while(pk.hasNext())
	     {
	    	System.out.println(pk.next());
	     } 
	    
	     System.out.println();
	    
	     System.out.println("Display all values by using ListIterator");
	    
	     ListIterator kp = vc.listIterator();
	    
	     while(kp.hasNext())
	     {
	    	System.out.println(kp.next());
	     }
	     
	     System.out.println();
	     
	     System.out.println("Display all values by using Enumeration");
	     
	     Enumeration jp = vc.elements();  //libraries using elements - enumeration
	     
	     while(jp.hasMoreElements())
	     {
	    	 System.out.println(jp.nextElement());
	     }
	     
	    
	    
	    
	    
	    
	     
	     
	    
	     
	     
	     
	     
	     
	     
		

	}

}
