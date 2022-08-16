package string;

public class Change_order_of_string {

	public static void main(String[] args) 
	{
	   	String name = "I Love My India";
	   	String[] ar = name.split(" ");
	   	
	   	for(int i=0; i<=ar.length-1;i++)
	   	{
	   		if(i%2!=0)
	   		{
	   			String sp = ar[i];
	   			
	   			ar[i] = revString(sp);
	   		}
	   	}
	   	
	   	for(int i=0; i<=ar.length-1; i++)
	   	{
	   		System.out.println(ar[i]+" ");
	   	}

	}
	
	public static String revString (String input)
	{
		String rev = " ";
		
		for(int i=input.length()-1; i>=0; i--)
		{
			rev = rev + input.charAt(i);
		}
		return rev;
	}

}
