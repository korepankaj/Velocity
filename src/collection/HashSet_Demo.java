package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;

public class HashSet_Demo {

	public static void main(String[] args) 
	{
         HashSet hs = new HashSet();
         
         hs.add("");
         hs.add("Velocity");
	     hs.add(200);
	     hs.add(100.99);
	     hs.add(null);
	     hs.add(true);
	     hs.add("Velocity");
	     hs.add('Z');
	     hs.add(null);
	     hs.add("Pankaj");
	     hs.add('B');
	     hs.add(99.99);
	     hs.add("Pankaj");
	    
	     
	     System.out.println("Display all values except duplicate value");
	     System.out.println(hs);
	     System.out.println();
	     
	     System.out.println("Display size of the all values");
	     System.out.println(hs.size());
	     System.out.println();
	     
	     System.out.println("Copy the hashset file by using clone()");
	     System.out.println(hs.clone());
	     System.out.println();
	     
	     System.out.println("Check empty or not");
	     hs.clear();
	     System.out.println(hs.isEmpty());
         System.out.println();
	     
	     System.out.println("Display all values by using iterator");
	     Iterator pk = hs.iterator();
	     
	     while(pk.hasNext())
	     {
	    	 System.out.println(pk.next());
	     }
	     
	     System.out.println();
	     
	     System.out.println("Display all values by using for each loop");
	  
		for(  Object kp : hs)
	     {
	    	 System.out.println(kp);
	     }
	     
	     
	    
	       
	}

}
