package controlstatement.Conditional_statement;

public class Nested_If 
{
   public static void main(String[] args) 
   {
		
		String Username = "Pankajkore22121992";
		
		String Password = "Pankajkore@23";
		
		if(Username=="Pankajkore22121992")
		{
			System.out.println("Username is correct please enter password");
		   
			if(Password=="Pankajkore@24")
		    {
			  System.out.println("log in successfully");
		    
		    }
		      else
		    {
			  System.out.println("Please enter correct password");
	        }
		}
		else
		{
			System.out.println("Incorreect username, please enter correct username");
	    }
	 }

}
