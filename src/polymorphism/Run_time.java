package polymorphism;

public class Run_time extends Run_time_polymorphism
{
	public void pankaj(int a)
	{
		System.out.println("i am pankaj");
	}
	
	public static void main(String[] args)
	{
		Run_time_polymorphism rtp = new Run_time_polymorphism();
		rtp.pankaj(20);
		
		Run_time rt = new Run_time();
		rt.pankaj(10);
		
	    
	}

}