package array_multi_dimensional;

public class Multi_array_for_loop {

	public static void main(String[] args) 
	{
           //Array declaration
		                    //2-row 2-column
		 int rollno[][] = new int[2][2];
		 
		 //Array initialization
		 
		 rollno[0][0] = 1;
		 rollno[0][1] = 2;
		 rollno[1][0] = 3;
		 rollno[1][1] = 4;
		 
		 
		 //Array usage
		 
		 for(int i=0; i<=1; i++)  //this loop is for row  //outer loop
		 {
			 for(int j=0; j<=1; j++) ////this loop is for column  //inner loop
			 {
				 System.out.print(rollno[i][j]+" ");
			 }
			 
			 System.out.println();
		 }
		 

	}

}
