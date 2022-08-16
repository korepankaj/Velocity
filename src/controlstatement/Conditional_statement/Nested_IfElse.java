package controlstatement.Conditional_statement;

public class Nested_IfElse 
{

	public static void main(String[] args) 
	{
		//if card is inserted then enterPin
		//if pin is correct then--> transaction success
		//else incorrect Pin, transaction is failed
		//else, please insert card

		boolean card = true;
		String pin = "123";
		
		if(card==true)
		{
			System.out.println("Please enter pin");
			
			if (pin=="1234")
			{
				System.out.println("Transaction successful, please collect cash");
			}
			else 
			{
				System.out.println("encorrect pin, please enter correct pin ");
			}
		}
		else
		{
			System.out.println("Please Insert card");
		}
		
	
	}

}
