package method;

public class Nonstaticmethod 
{

	public static void main(String[] args) 
	{
	
		//classname objectname = new classname
		
		Nonstaticmethod n = new Nonstaticmethod();
		n.notstatic();
		//n.nonstatic();  //calling nonstatic method from same class
		
		//classname objectname = new classname
		
		Otherclass p = new Otherclass();
		
		p.nonstaticm();   //calling non static method from different class
		
	
	}
	public void nonstatic()
	{
		System.out.println("This is nonstatic method");
		
		//notstatic();  //calling non static method from same class
		
	}
	public void notstatic()
	{
		System.out.println("This is the notstatic method");
		
		this.nonstatic();   //calling non static regular method using "this" keyword.
	}
}
class Otherclass
{
	public void nonstaticm()
	{
		System.out.println("This is nonstatic regular method from Otherclass");
	}
}
