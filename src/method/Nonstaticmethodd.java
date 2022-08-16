package method;

public class Nonstaticmethodd 
{
	//static global variable
	
	static int a;
	static int b;
	

	public static void main(String[] args) 
	{
		//classname objectname = new classname
		
		Nonstaticmethodd p  = new Nonstaticmethodd();   // create object of a class
		
		p.addition();   //calling non static method from same class
		
		subtraction();   //calling static method from same class
		
		Nonstaticmethoddd mul = new Nonstaticmethoddd();  //calling non static method from another class
		mul.multiplication();
	}
	public void addition()   //nonstaticmethod
	{
		//int a;
		//int b;
		
		a=12;
		b=8;
		int addition = a+b;
		System.out.println("addition of the a & b is: "+addition);
		
		System.out.println("------------------------------------");
	}
	public static void subtraction()    //staticmethod
	{
		//int x;
		//int y;
		
		a=12;
		b=8;
		int subtraction = a-b;
		System.out.println("subtraction of the x & y is: "+subtraction);
		
		System.out.println("------------------------------------");
	}
}
class Nonstaticmethoddd
{
	public void multiplication()
	{
		int p;   //variable declaration
		int q;   //variable declaration
		 
		p = 12;   //variable initialization
		q = 8;    //variable initialization
		int multiplication = p*q;
		System.out.println("multiplication of the p & q is: "+multiplication);
	}
}