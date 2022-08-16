package polymorphism;

public class Compile_time 
{
    public void add()  //zero argument 
    {
    	int a=10, b=20, c;
    	c= a+b;
    	System.out.println("Zero argument");
    	
    	System.out.println("Addition of a and b is : "+c);
    	
    	System.out.println();
    }
	
    public void add(int x, int y)  //two argument
    {
        int z = x - y;
        
        System.out.println("two argument");
        
        System.out.println("Subtraction  :  "+z);
        
        System.out.println();
    }
    
    public void add(double p, int q)  //two argument but different data type
    {
        double r = p * q;
    	
        System.out.println("Two argument but different daya type");
    	System.out.println("Multiplication  :  "+r);
    	
    	System.out.println();
    }
    
    public void add(int p, double q)  //two argument same data type but sequence of argument is different
    {
    	double r = p + q;
    	
    	System.out.println("Two argument, same data type but sequence of argument different");
    	System.out.println("Addition        :   "+r);
    }

	public static void main(String[] args) 
	{
        	Compile_time ct = new Compile_time();
        	ct.add();
        	
        	ct.add(80, 20);
        	ct.add(2.5, 12);
        	ct.add(30, 0.0);

	}

}
