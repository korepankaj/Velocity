package constructor;

public class Constructor 
{
	
	// variable declaration 
	
   int a = 50;
   int b = 30;   //global variable
   // int p,q;
    //int x,y;
    
   public Constructor()      //User defined constructor
   {
    	
	  System.out.println("Welcome to User defined constructor");    //variable usage
	   
	  System.out.println("#################################################");
	   
	   
	  //variable initialization
	   
	   //a = 50;
	   //b = 30;
	   //p = 100;
	   //q = 70;
	   //x = 25;
	   //y = 3;
	   
	}
    
	public static void main(String[] args) 
	{
		Constructor c = new Constructor();  //creating object  //calling constructor method
		
		c.velocity(); //calling non static method from same class
		
    }
	
	void velocity()  //non static method
	{
		
		 int addition = a+b;
		 int subtraction = a-b;
		 int multiplication = a*b;
		 
		
		// Variable usage
		System.out.println("Addition of the two variable is  :  "+addition);
		
		System.out.println("-------------------------------------------------");
		 
		System.out.println("Subtraction of the two variable is  :  "+subtraction);
		
		System.out.println("-------------------------------------------------");
		
		System.out.println("Multiplication of the two variable is  :  "+multiplication);
	}

}
