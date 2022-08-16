package interfacee;

public class Impclass implements Myinterface  //one class can implement interface  
{
	@Override
	public void m1() 
	{
		System.out.println("Method m1 implement in another class");
	}

	@Override
	public void m2() 
	{
		System.out.println("Method m2 implement in another class");
		
	}
	
	public void m3()
	{
		System.out.println("Method M3 completed in implemented class ");
	}
	
	public static void main(String[] args)
	{
		System.out.println(a);  //calling variable of interface
		
		Impclass imp = new Impclass();
		imp.m1();
		imp.m2();
		imp.m3();  //own method of implementation class
	}
	

}
