package generalization;

public class Airtel implements Trai
{
	@Override
	public void call() 
	{
	   System.out.println("1.2hr/Min");
	}

	@Override
	public void messg() 
	{
		System.out.println("150 messg/Day");
	}

	@Override
	public void internet() 
	{
		System.out.println("1.8GB/Day");
		
		System.out.println();
	}
	
	public void Airtel1()
	{
		System.out.println("Airtel schemes");
		
		System.out.println();
	}
	

	public static void main(String[] args) 
	{
		Jio j = new Jio();
		j.Jio1();
		j.call();
		j.messg();
		j.internet();
		
		
		Idea i = new Idea();
		i.Idea1();
		i.call();
		i.messg();
		i.internet();
		
		
		Airtel a = new Airtel();
		a.Airtel1();
		a.call();
		a.messg();
		a.internet();
		
		
    }

	

}
