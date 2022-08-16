package array_multi_dimensional;

public class MultiDimensionalArray1 {

	public static void main(String[] args) 
	{
		//Array declaration + initialization without new keyword
		int rollno[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
	    
	    //Array declaration + initialization with new keyword
	    char alpha[][] = new char[][] {{'A','b','c'},{'D','E','F'},{'G','H','I'},{'J','K','L'}};
	    
	    // Array usage
	    for(int i=0; i<=2; i++)
	    {
	    	for(int j=0; j<=2; j++)
	    	{
	    		System.out.print(rollno[i][j]+" ");
	    	}
	    	
	    	System.out.println();
	    }
	    
	    System.out.println("==========================");
	    
	    //Array declaration + initialization
	    
	    int[][] rollno1 = new int[][] {{1,2,3}, {4,5,6}, {7,8,9}};
	    
	    //Array usage
	    
	    for(int k=2; k>=0; k-- )
	    {
	    	for(int l=2; l>=0; l--)
	    	{
	    		System.out.print(rollno1[k][l]+" ");
	    	}
	    	
	    	System.out.println();
	    }
	    
	    System.out.println("===========================");
	    
	    for(int i=0; i<=3; i++)
	    {
	    	for(int j=0; j<=2; j++)
	    	{
	    		System.out.print(alpha[i][j]+" ");
	    	}
	    	
	    	System.out.println();
	    }
	     
	}

}
