package controlstatement.Looping_statement;

public class Do_while_loop 
{
	 public static void main(String[] args) 
	{
		System.out.println("Do-while loop increment and decrement");	
		   
		System.out.println("--------------------------------------");
		
		int s = 2;   //declaration + initialization 
		
		do
		{
		   
		  System.out.print(s + " ");	
		   
		  s=s+2;  //updation
		}
		
		while (s<=20);  //condition
	
		 
		System.out.println("-------------------------------------");
		
		int a = 20;  //initialization
		 
		do
		{
			 System.out.print(a+" ");
			 
			 a = a-2;  //updation
		 }
	     while(a>=2); //condition
			
	}
	 
	 
}
