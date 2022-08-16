package controlstatement.Looping_statement;

public class For_loop 
{

	public static void main(String[] args) 
	{
		System.out.println("Multiplication of 2");
		for (int i=2; i<=20; i=i+2)
		{
			System.out.println(i);
		}
		
		System.out.println("-----------------------------");
		
		System.out.println("Reverse multiplication of 2");
		
		{
			for (int i=20; i>=2; i=i-2)
			{
				System.out.println(i);
			}
		}
		
		System.out.println("-----------------------------");
		
		System.out.println("1 to 10");
		
		{
			for (int i=1; i<=10; i++)
			{
				System.out.println(i);
			}
		}

	}

}
