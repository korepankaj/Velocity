package this_super_keyword;

public class This {

	int a = 20;
	int b = 30;
	
    static int z = 1;
	
	public static void main(String[] args) 
	{
       This t = new This();
       t.platinum();
       
     //In this program we use " THIS Keyword " for calling global variable.  
       // condition - Local variable and global variable data type should be the same.

	}
	
	void platinum()
	{
		int a = 40;
		int b = 60;
		int z = 2;
	

		System.out.println(a);    //calling non static local variable 
		System.out.println(this.a);  //calling non static global variable using this keyword
		System.out.println(b);  //calling non static local variable 
		System.out.println(this.b); //calling non static global variable using this keyword
		System.out.println(z);  //calling non static local variable  
		System.out.println(this.z);  //calling static global variable using this keyword
	}
	
	

}
