package string;

final class String_method 
{

	public static void main(String[] args) 
	{
		//constant pool area
		String s = "Hi";  //created object of string without using 'new' keyword
		
		//non constant pool area
		String s1 = new String("Pankaj"); //created object of string using 'new' keyword
		
  //1. use of length method
		
		System.out.println("we can use length for temporary. we can't use length in future");
		System.out.println(s.length());  //By using this statement we can’t use length in future.
		System.out.println(s1.length()); //By using this statement we can’t use length in future.
		
		System.out.println();
		System.out.println("save length in reference variable for we can use length in future ");
		
		int length = s.length();    //By using this statement we can use length in future.
        System.out.println(length); //calling variable
        
        int length1 = s1.length();  //By using this statement we can use length in future.
        System.out.println(length1); //calling variable
        
        System.out.println();
        System.out.println("length count blank space as a temporary");
        
        String pk = "     ";
        System.out.println(pk.length());  //length count blank space as well. we can't use this blank space in future.
        
        System.out.println();
        System.out.println("We stored blank space in reference variable");
        
        int blank = pk.length();  //We stored blank space in reference variable. we can use this blank space in future.
        System.out.println(blank);
        
        
        /*System.out.println();
        System.out.println("When we perform operation on NULL value then we get null pointer exception");
        String pk1 = null;
        System.out.println(pk1.length());*/
        
    //2. use of touppercase() method
        
        System.out.println();
        System.out.println("The string upper case is done for temporary");
        
        System.out.println(s1.toUpperCase()); //The string upper case is done for temporary. we can't use this upper case string in future
        
        System.out.println();
        System.out.println("We stored uppercase string in referenced variable.");
        
        String upper = s1.toUpperCase();  //stored upper case string in referenced variable. also we can use this upper case string in future 
        System.out.println(upper);
        
    //3. use of tolowercase() method
        
        System.out.println();
        System.out.println("The string lower case is done for temporary");
        
        System.out.println(s1.toLowerCase()); ////The string lower case is done for temporary. we can't use this upper case string in future.
        
        System.out.println();
        System.out.println("We stored lowercase string in referenced variable.");
        
        String lower = s1.toLowerCase();  //stored upper case string in referenced variable. also we can use this upper case string in future 
        System.out.println(lower);
        
        System.out.println();
        System.out.println("we use upper variable. we were created for the upper case");
        
        System.out.println(upper.toLowerCase()); //The same reference variable we created for upper case is the same variable you used for lower case.
       
    //4. use of equals() method
        
        String pk1 = "Pankaj";
        String pk2 = "Pankaj";
        String pk5 = null;
        String pk3 = new String ("PANKAJ");
        String pk4 = new String ("Pankaj");
        String pk6 = new String("Pankaj");
  
           
        System.out.println();
        System.out.println("Equal operation");
        
        System.out.println(pk1 == pk2); //in this statement check memory location 
        System.out.println(pk2 == pk3); //in this statement check memory location 
        System.out.println(pk3 == pk4); //in this statement check memory location
       // System.out.println(pk5 == pk2);
        System.out.println("==========================");
        System.out.println(pk1.equals(pk2)); //in this statement check content with case sensitive
        System.out.println(pk2.equals(pk3)); //in this statement check content with case sensitive
        System.out.println(pk3.equals(pk4)); //in this statement check content with case sensitive
        System.out.println(pk2.equals(pk5));  //in equal() we can perform operation on null value
        System.out.println(pk4.equals(pk6));
        //System.out.println(pk5.equals(pk2));
        
        
    //5. use of Equalignore method   
        
        System.out.println();
        System.out.println("Equal ignore case");
        
        System.out.println(pk3.equalsIgnoreCase(pk4)); //in this statement check same string are available or not. here ignored case sensitive. 
       
    //6. use of contains() method
        
        System.out.println();
        System.out.println("Contains method");
        System.out.println(s1.contains("pan")); //Contains method check sequence of character with case sensitive
        
    //7. use of isEmpty method       
        
        System.out.println();
        System.out.println("IsEmpty method");
       
        String e0 = "pune";
        String e1 = "    ";
        String e2 = null;
        String e3 = "";
        
//in empty() if any content and blank space are available it is false. if it is nothing then it is true.
       
        System.out.println(e0.isEmpty());
        
        /*boolean empty = e0.isEmpty();
        System.out.println(empty);*/
        
        System.out.println(e1.isEmpty());
      //System.out.println(e2.isEmpty());
        System.out.println(e3.isEmpty());
        System.out.println("======================");
        System.out.println("blank method");
//in blank() if blank space are available then it is true. if any content are available then false.
        System.out.println(e0.isBlank());
        System.out.println(e1.isBlank());
        System.out.println(e3.isBlank());
        
   //8. Use of CharAt method
        
        System.out.println();
        System.out.println("charAt method");
  //in charAt() In this method the character can be displayed according to the index number
        System.out.println(s1.charAt(0));
        
        char charat = s1.charAt(3);  //create reference of variable
        System.out.println(charat);
        
        
       //when we give input out of the range of the string length then outofboundexception occurred. 
       //System.out.println(s1.charAt(6));  //outofboundexception
       //System.out.println(s1.charAt(-1));
        
   //9. Use of Endswith method    
        
        System.out.println();
        System.out.println("endsswith method");
//in endswith() if end of the character are same with same sequence then it is true. otherwise false
        System.out.println(s1.endsWith("j"));
        System.out.println(s1.endsWith("kaj"));
        System.out.println(s1.endsWith("akaj"));
        System.out.println(s1.endsWith("pan"));
        
   //10. Use of Startswith method    
        
        System.out.println();
        System.out.println("startswith method");
//in startswith() if start of the character are same with same sequence then it is true. otherwise false. 
        System.out.println(s1.startsWith("p"));
        System.out.println(s1.startsWith("pan"));
        System.out.println(s1.startsWith("kaj", 3));
        System.out.println(s1.startsWith("ankaj", 2));
        
  //11. use of Substring method     
        
        System.out.println();
        System.out.println("substring method");
 //Input the index number from where you want the character or input the starting index are correct and ending index are +1
        System.out.println(s1.substring(3));
        System.out.println(s1.substring(2, 6));
        
   //12. Use of concat method
        
        System.out.println();
        System.out.println("Concat method");
   //in concat() we attached two or more string 
        String a1 = "My name ";  //1st string
        String a2 = "is";   //2nd string
        String a3 = " Pankaj";  //3rd string
        
        System.out.println(a1.concat(a2)+(a3));  //attached 1st 2nd and 3rd string
        System.out.println(a1.concat("Pankaj"));  //attached 1st and newly created string
        System.out.println(a1.concat(a2.concat(a3)));
        
    //13. use of indexof method
        
        System.out.println();
        System.out.println("indexof method");
  //indexof() print index no. as per declared character
     
        System.out.println(s1.indexOf('j'));   
        
        int index = s1.indexOf('a'); //using variable of reference
        System.out.println(index);  
        
        String   p = "My name is anthony gonsalvis";
        
        System.out.println(p.indexOf('o')); //count blank space and print first 'O' index no.
        
   //14. use of lastindexof method
        
        System.out.println();
        System.out.println("lastindexof method");
    //in lastindexof() if we declare duplicate character. compiler print last duplicate character
        System.out.println(p.lastIndexOf('o')); //count blank space and print last 'O' index no.
        
        /* if we want to print duplicate character in between the string for that we have to declare previous 
        character index no. which character index no you want to print */
        System.out.println(p.indexOf('s', 18));  
        
    //15. use of replace method
        
        System.out.println();
        System.out.println("use of replace method");
        String d = "Tester";
        String d1 = "Life changing moment";
        
  //using replace() we replace the any character, String. We can only replace if there is a sequential character    
        System.out.println(d.replace('t', 'o'));  //replace 'o' character
        
        System.out.println(d.replace("Tester", "Developer"));   //replace "Developer" string
        
        System.out.println(d.replace("er", " "));  //replace blank space
        
        System.out.println(d1.replace(" ", "*"));
        
      //16. Use of split method
        
        System.out.println();
        System.out.println("Use of split method");
        
        String name = "Velocity_corporate_training_center";
        
        String names[] = name.split("_");
        
        for(int i=0; i<=3; i++)
        {
        	System.out.println(names[i]);
        }
        System.out.println();
        
        System.out.println("external mock program");
        
        String a = "Prajakta";
        String b = " Thorat";
        
        System.out.println(a.concat( b));
        
        
    }

}