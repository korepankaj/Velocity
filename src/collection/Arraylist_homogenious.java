package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist_homogenious {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(10);
		
		System.out.println(al);
		
		System.out.println();
		
		System.out.println("Display all values by using For each loop");
		
		for( Integer pk : al)
		{
			System.out.println(pk);
		}
		
		System.out.println();
		
		System.out.println("Display all values by using iterator");
		
		Iterator<Integer> pk = al.iterator();
	
		while(pk.hasNext())
		{
			System.out.println(pk.next());
	    }
		
		System.out.println();
		
		System.out.println("Display all values by using ListIterator");
    
	    ListIterator<Integer> kp = al.listIterator();
	    
	    while(kp.hasNext())
	    {
	    	System.out.println(kp.next());
	    }
		

	}

}
