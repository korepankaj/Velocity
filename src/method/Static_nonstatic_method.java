package method;

public class Static_nonstatic_method 
{

	public static void main(String[] args) 
	{
		
		Static_nonstatic_method snm = new Static_nonstatic_method();
		snm.Platinum();  //calling non static method using object

	}
	
	public static void Gold()
	{
		
		System.out.println("Welcome to Gold entry");
		
	}
	
	public void Platinum()
	{
		System.out.println("Welcome to platinum entry");
		
		Gold();  //calling static method in non-static method
	}

}
