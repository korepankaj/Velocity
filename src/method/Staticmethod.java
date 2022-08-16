package method;

public class Staticmethod 
{

	public static void main(String[] args) 
	{
		System.out.println("This is static method");
		
		manual();  //calling static method from same class

		Velocity.staticm();  // calling static method from different class
	}
	
	public static void manual()
	{
		System.out.println("This is Manual testing");
		
		automation();  //calling static method from same class
		
	}
	public static void automation()
	{
		System.out.println("This is automation testing");   
	}
}

class Velocity
{
	public static void staticm()
	{
		System.out.println("Calling static method from different class");
	}
}

