package parameter;

public class Addsubmul {

	public static void main(String[] args) 
	{
		Addsubmul asm = new Addsubmul();
		asm.add();   //calling non static method without parameter
		asm.sub(50, 20);  //calling non static method with parameter
		
		asm a = new asm();
		a.mul(25, 3);   //calling non static method with parameter from different class

	}
	
	void add()  //Zero parameter
	{
		int a;  //variable declaration
		int b;  //variable declaration
		int addition; 
		a = 50;  //variable initialization
		b = 50;  //variable initialization
		addition = a+b;
		
	    System.out.println("Addition of the 50 + 50  =  "+addition);  //variable usage
	    
	    System.out.println("###########################################");
		
	}
	void sub(int p, int q)   //with parameter
	{
		int subtraction= p-q;
		System.out.println("Subtraction of the 50 - 20 = "+subtraction);
		
		System.out.println("###########################################");
	}
}
class asm
{
	void mul(int x, int y)
	{
		int multiplication = x * y;
		
		System.out.println("Multiplication of the 50*3 = "+multiplication);
		
		System.out.println("###########################################");
	}
}
