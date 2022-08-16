package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_Generic{

	public static void main(String[] args) 
	{
		 //Generic type of arraylist
	     ArrayList al = new ArrayList();	 //created object of arraylist
	     
	     al.add("Velocity");
	     al.add(200);
	     al.add(100.99);
	     al.add(null);
	     al.add(true);
	     al.add("Velocity");
	     al.add('Z');
	     al.add(null);
	     al.add("Pankaj");
	     al.add('B');
	     al.add(99.99);
	     
	     System.out.println("Print all values");
	     System.out.println(al);
	     System.out.println();
	     
	     System.out.println("Display size of records");
	     System.out.println(al.size());
	     System.out.println();
	     
	     System.out.println("Print values as per index no");
	     System.out.println(al.get(8));
	     System.out.println();
	     
	     System.out.println("Print index no as per values");
	     System.out.println(al.indexOf("Velocity"));
	     System.out.println();
	     
	     System.out.println("print index no for duplicate values ");
	     System.out.println(al.lastIndexOf("Velocity"));
	     System.out.println();
	     
	     System.out.println("Check case sensetive");
	     System.out.println(al.contains("pankaj"));
	     System.out.println();
	     
	     System.out.println("Remove any values as per index no and diplay updated list");
	     System.out.println(al.remove(1));
	     System.out.println(al);
	     System.out.println();
	     
	     System.out.println("add new value to the last index");
	     al.add("Pune");
	     System.out.println(al);
	     System.out.println();
	     
	     System.out.println("Add value to the specific index");
	     al.add(1, 200);
	     System.out.println(al);
	     System.out.println();
	     
	     System.out.println("Remove any value as per value");
	     al.remove(null);
	     System.out.println(al);
	     System.out.println();
	     
	     System.out.println(al.get(0));
	     System.out.println(al.get(1));
	     System.out.println(al.get(2));
	     System.out.println(al.get(3));
	     System.out.println(al.get(4));
	     System.out.println(al.get(5));
	     System.out.println(al.get(6));
	     System.out.println(al.get(7));
	     System.out.println(al.get(8));
	     System.out.println(al.get(9));
	     System.out.println(al.get(10));
	     System.out.println();
	     
	     System.out.println("Display all values using static for loop");
	     for(int i=0; i<=10; i++)
	     {
	    	 System.out.println(al.get(i));
	     }
	     
	     System.out.println();
	     System.out.println("Display all values using dynamic for loop");
	     for(int i=0; i<=al.size()-1; i++)
	     {
	    	 System.out.println(al.get(i));
	     }
	     
	     System.out.println();
	     
	     System.out.println("Display all values using For Each Loop");
	     
	     for( Object p : al)
	     {
	    	 System.out.println(al);
	     }
	     
	     System.out.println();
	     
	     System.out.println("Display all values Using Iterator");
	     
	     Iterator pk = al.iterator();    //al is a object of iterator and pk is a variable of interface. 
	     
	     while(pk.hasNext())
	     {
	    	 System.out.println(pk.next());
	     }
	     
	     System.out.println();
	     
	     System.out.println("Display all values using ListIterator");
	     
	     ListIterator kp = al.listIterator();
	     
	     while(kp.hasNext())
	     {
	    	 System.out.println(kp.next());
	     }
	     
	     
	     
	    
	     
	     
	     
	     
	     
	     
	}

}

