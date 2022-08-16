package constructor;

public class Parameterizedconstructor 
{
	
	int a;
	int b;
	int c;
	
	public Parameterizedconstructor()   //zero parameterized constructor
	{
		//variable initialize
		
		a=11;
		b=22;
		c=33;
		
	}
	
	public Parameterizedconstructor(int x)
	{
		a=x;
	}
	public Parameterizedconstructor(int x, int y)
	{
		a=x;
		b=y;
	}
	public Parameterizedconstructor(int x, int y, int z)
	{
		a=x;
		b=y;
		c=z;
	}

	public static void main(String[] args) 
	{
		Parameterizedconstructor a = new Parameterizedconstructor(50);
		a.addition();
		
		Parameterizedconstructor b = new Parameterizedconstructor(10,10);
		b.addition();
		
        Parameterizedconstructor c = new Parameterizedconstructor(10,20,30);
        c.addition();
	}
	public void addition()
	{
		int sum = a+b+c;
	   
		
		System.out.println("Addition of the variable is        :  "+sum);
		
	
	}

}
