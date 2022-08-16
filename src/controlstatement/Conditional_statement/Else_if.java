package controlstatement.Conditional_statement;

public class Else_if {

	public static void main(String[] args) 
	{
		// If it is summer, the temperature status should be displayed
		
		String season = "winter";
		
		if (season == "summer")
		{
			System.out.println("Its temperature very hot");
		}
		
		else if (season == "rainy")
		{
			System.out.println("Its raining heavily");
		}
		
		else if (season == "winter")
		{
			System.out.println("It's very cold");
		}
		
		else 
		
		{
			System.out.println("Invalid season");
		}

	}

}
