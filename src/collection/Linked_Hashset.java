package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Spliterator;

public class Linked_Hashset {

	public static void main(String[] args) 
	{
		LinkedHashSet lhs = new LinkedHashSet();
		
		 lhs.add("Velocity");
	     lhs.add(200);
	     lhs.add(100.99);
	     lhs.add(null);
	     lhs.add(true);
	     lhs.add("Velocity");
	     lhs.add('Z');
	     lhs.add(null);
	     lhs.add("Pankaj");
	     lhs.add('B');
	     lhs.add(99.99);
	     lhs.add("Pankaj");
	     
	     System.out.println("Display all values");
	     System.out.println(lhs);
	     System.out.println();
	     
	     System.out.println("Display size of values");
	     System.out.println(lhs.size());
	     System.out.println();
	     
	     System.out.println("Check case sensetive");
	     System.out.println(lhs.contains("Velocity"));
	     System.out.println();
	     
	     System.out.println("Remove index as per value");
	     //System.out.println(lhs);
	     lhs.remove('B');
         System.out.println(lhs);	
         System.out.println(lhs.size());
         
//         System.out.println("Remove all data");
//         lhs.removeAll(lhs);
//         System.out.println(lhs);
//         System.out.println(lhs.size());
           System.out.println();
         
         System.out.println("Display all values by using iterator");
         Iterator sp = lhs.iterator();
         
         while(sp.hasNext())
         {
        	 System.out.println(sp.next());
         }
         System.out.println();
         
         System.out.println("Display all values by using for each loop");
         for( Object ps : lhs)
         {
        	 System.out.println(ps);
         }
         System.out.println();
         
         
        
         
         
         

	}

}
