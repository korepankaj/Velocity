package parameter;

public class Parameterwithstaticmethod {

	public static void main(String[] args) 
	
	{
		
		 // calling static method without parameter
	    studentinfo();
		
	    // calling static method with parameter //variable initializing
			  
	    professionalinfo("KPIT Technology", "Asset management support", 141222, "Hinjewadi Phase-3", "Pune");
		
	    pankaj.classinfo(); //calling static method, zero parameter from different class
	    
	    //with parameter called from different class
	    
	    pankaj.classinfo1("Velocity Trainig Pvt Ltd", "Manual Testing", "Jayesh Sir", "7:30 PM", "Velocity 9th April Evening Testing");
	 }
	 public static void studentinfo()
	 {
	    //Variable declaration
		 
		String Name1;
		byte Rollno;
		int Age;
		char Grade;
		String Gender;
		long Mobno;
		double Weight;
		float Height;
		boolean Information;
					
		//Variable initialization
					
		Name1 = "Pankaj";
	    Rollno = 22;
		Age = 28;
		Grade = 'B';
		Gender = "Male";
		Mobno = 9763807421l;
		Weight = 74.56;
		Height = 5.9f;
		Information = true;
					
		//Variable usage
				    
		System.out.println("My name is                      :  "+Name1);
		System.out.println("My rollno is                    :  "+Rollno);
		System.out.println("My current age is               :  "+Age);
		System.out.println("My final qualification Grade is :  "+Grade);
		System.out.println("I am                            :  "+Gender);
		System.out.println("My personal Mobno is            :  "+Mobno);
		System.out.println("My total Weight is              :  "+74.56);
	    System.out.println("My total Height is              :  "+Height);
	    System.out.println("This information is             :  "+Information);
				    
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			
	}
	                                      //Parameter //variable declaration
	public static void professionalinfo(String companyName, String name, int IDno, String Address, String Loc) 
	{
	    	    	
	    // variable usage
	    	    	
	    System.out.println("My employer name is    :  "+companyName);
	    System.out.println("My profile name is     :  "+name);
	    System.out.println("My ID no is            :  "+IDno);
	    System.out.println("My Company address is  :  "+Address);
	    System.out.println("My company Location is :  "+Loc);
	    	    	
	    	    	
	    System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	    	    	
	 }
	    
}
class pankaj
{
	public static void classinfo()  //zero parameter
	{
		// variable declaration
		
		String name;
		String sub1;
		String faculty;
		String time;
		String batch;
		
		// variable initialization
		
		name = "Velocity Training pvt ltd";
		sub1 = "Automation/Java";
		faculty = "Joshi sir";
		time = "6:30 PM";
		batch = "velocity 9th April Evening Testing";
		
		// variable usage
		
		System.out.println("My class name is       :  "+name);
		System.out.println("subject name is        :  "+sub1);
		System.out.println("Faculty name is        :  "+faculty);
		System.out.println("Class batch timing is  :  "+time);
		System.out.println("Batch name is          :  "+batch);
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
	}                               //variable declaration 
	public static void classinfo1(String name, String sub2, String faculty, String time, String batch)
	{
		
		//variable usage
		
		System.out.println("My class name is       :  "+name);
		System.out.println("subject name is        :  "+sub2);
		System.out.println("Faculty name is        :  "+faculty);
		System.out.println("Class batch timing is  :  "+time);
		System.out.println("Batch name is          :  "+batch);
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	}
}




