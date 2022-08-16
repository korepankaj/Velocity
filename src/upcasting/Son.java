package upcasting;

public class Son extends Father
{
	public void car()
	{
		System.out.println("irtiga");
	}

	public void bike()
	{
		System.out.println("Ninja suzuki");
	}
	
	public void degree()
	{
		System.out.println("MCA");
	}
	public static void main(String[] args) 
	{
		//Left side (father f) is reference of object
		//Right side (new son()) is a memory of object
		
		Father f = new Son(); //creating object of subclass and giving reference of superclass
		f.bike();  //common property
		f.car();   //common property
	    f.city();  //superclass property
	    
	    Father f1 = new Daughter();
	    f1.car();
	    f1.bike();
	    f1.city();
	    
	}

}

//in casting subclass property can't access
//Upcasting = inheritance + method overriding