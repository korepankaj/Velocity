package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset_study {

	public static void main(String[] args) 
	{
	    TreeSet ts = new TreeSet();
	    
	 
	    ts.add(200);
	    ts.add(10);
	    ts.add(300);
	    ts.add(5);
	    ts.add(12);
	    ts.add(15);
	    
	    
	    System.out.println("Display all values");
	    System.out.println(ts);
	    System.out.println();
	    
	    System.out.println("Display size of the object");
	    System.out.println(ts.size());
	    System.out.println();
	    
	    System.out.println("Display all values by using for each loop");
	    
	    for( Object sp : ts)
	    {
	    	System.out.println(sp);
	    }

	    System.out.println();
	    
	    System.out.println("Display all values by using iterator");
	    
	    Iterator ps = ts.iterator();
	    
	    while(ps.hasNext())
	    {
	    	System.out.println(ps.next());
	    }
	    
	    System.out.println();
	    
	    System.out.println("Retrives and removes the first element");
	    System.out.println(ts.pollFirst());
	    System.out.println(ts);
	    System.out.println();
	    
	    System.out.println("Retrives and removes the last element");
	    System.out.println(ts.pollLast());
	    System.out.println(ts);
	    System.out.println();
	    
	    
	    
	}

}
