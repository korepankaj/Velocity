package access_modifier;

public class Access_modifier 
{
	int a = 20;
	int b = 50;
	int c = 60;
	int d = 80;

	public static void main(String[] args) 
	{
		Access_modifier am = new Access_modifier();
		am.add();  //calling private method within same class
	}
	
	private void add()  //private method
	{
		int e;
		e = a + b;
		
		System.out.println("Addition of two value : "+e);
	}
	
	void sub()  //default method
	{
		int e;
		e = c- a;
		System.out.println("Subtraction of two value : "+e);
	}
	
	public void mul()  //public method
	{
		int e;
		e = b * a;
		
		System.out.println("Multiplication of two value  :  "+e);
	}
	
	protected static void protect() //protected method
	{
		System.out.println("This is protected method");
	}
	
}
