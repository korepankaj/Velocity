package variable_basic;

public class Static_variable 
{

	 static int a = 80;
	 static int c = 35;
	 
	public static void main(String[] args)
	{
         		
            int b = 45;
            
            System.out.println("value of b is  :  "+b);  //calling local variable 
            
            Static_variable sv = new Static_variable();
            sv.velocity();  //calling non static method from same class
           
            
            Static_variable.velocity1();  //calling static method from same class
            
            
            //calling global static variable from different class by using class name
            System.out.println("value of p is  :  "+Velocity_training.p);  
            
            
	}
	
	public void  velocity()  //non static method
	{
		System.out.println("value of a is  :  "+a); //calling global static variable from same class 
	
	}
	
	public static void velocity1()  //static method
	{
		System.out.println("value of c is  :  "+c);  //calling global variable from same class
	
	}

}

class Velocity_training
{
	static int p = 65;   //static global variable
}
