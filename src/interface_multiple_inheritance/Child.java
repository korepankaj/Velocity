package interface_multiple_inheritance;

public class Child implements Father, Mother
{
	//child class implements two interfaces father and mother
	
	//two parents one child --> multiple inheritance concept achieved

	@Override
	public void receipe() 
	{
		System.out.println("Receipe method completed by child");
	}

	@Override
	public void look() 
	{
		System.out.println("look method completed by child");
	}

	@Override
	public void money() 
	{
		System.out.println("Money method completed by child");
	}

	@Override
	public void property() 
	{
		System.out.println("Property method completed by child");
	}
	
	public static void main(String[] args)
	{
		Child c = new Child();
		c.receipe();
		c.look();
		c.money();
		c.property();
	}
	

}
