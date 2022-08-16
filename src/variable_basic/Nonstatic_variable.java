package variable_basic;

public class Nonstatic_variable 
{
	
	int a = 500;
    int c = 200;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Nonstatic_variable nv = new Nonstatic_variable(); 
		nv.velocity1();  //calling non static method from same class

		
		velocity();  //calling static method from same class
		
		//calling non-static global variable by using object
		System.out.println("value of a is  :  "+nv.a);  
		
		Nonstatic_variable1 nv1 = new Nonstatic_variable1();
		
		//calling non static global variable from different class by using object
		System.out.println("value of p is  :  "+nv1.p);
		

	}
	
	public static void velocity()
	{
		int b = 300; 
		
		System.out.println("value of b is  :  "+b);  //calling local variable 
		
		Nonstatic_variable nv1 = new Nonstatic_variable();
		System.out.println("a value is : "+nv1.a);  //calling non-static global variable 
		
	}
	
	public void velocity1()
	{
		System.out.println("value of c is  :  "+c);  // calling  non static global variable from same class 
		
	}
	
}

class Nonstatic_variable1
{
	int p = 900;
}
