package array_single_dimensional;

public class ArrayDemo {

	public static void main(String[] args) 
	{
		//String ar[] = new String{ar[1], };

		//Array declaration
		String vel[] = new String[4];
		
		//Array initialization
		vel[0] = "Velocity";
		vel[1] = "corporate";
		vel[2] = "Training";
		vel[3] = null;
		
		//Array usage
		
		System.out.println(vel[0]+" "+vel[1]+" "+vel[2]+" "+vel[3]);
		/*System.out.println(vel[1]);
		System.out.println(vel[2]);
		System.out.println(vel[3]);*/
	
		System.out.println("============================");
		
		//Array declaration
		String rollno[] = new String[5];
		
		//Array initialization
		
		rollno[0] = "1";
		rollno[1] = "2";
		rollno[2] = "3";
		rollno[3] = "4";
		rollno[4] = "5";
		
		//Array usage
		
		System.out.println(rollno[0]);
		System.out.println(rollno[1]);
		System.out.println(rollno[2]);
		System.out.println(rollno[3]);
		System.out.println(rollno[4]);
	}

}