package array_multi_dimensional;

public class MultiDimensionalArray {

	public static void main(String[] args) 
	{
		//Array declaration
		                 // 2-row 2-column
	   int[][] rollno = new int[2][2];

	   //Array initialization
	   
	   rollno[0][0] = 1;
	   rollno[0][1] = 2;
	   rollno[1][0] = 3;
	   rollno[1][1] = 4;
	   
	   //Array usage
	   
	   System.out.print(rollno[0][0]+" ");
	   System.out.println(rollno[0][1]);
	   System.out.print(rollno[1][0]+" ");
	   System.out.println(rollno[1][1]);
	   
	   
	}

}
