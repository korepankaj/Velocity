package controlstatement.Looping_statement;

public class For_looop 
{
  public static void main(String[] args) 
  {
			int n=15;
			int x=(n/2)+1;
			
			for(int i=1; i<=n; i++)
			{
				for(int j=1; j<=n; j++)
				{
					if((i==1&&j<=x)||j==1||(j==x&&i<=x)||(i==x&&j<=x))
	               { 
					  System.out.print("P");
	               }
					else
				   {
						System.out.print(" ");
				   }
				}
			
			   System.out.println();
		     }
  }
 
}

	


