package constructor;

public class Constructorr {
	
    // Variable declaration 
	
    String Sub, Sub1;
    String Faculty, Faculty1;
    String time,time1;
    String batch, batch1;
    String name, name1, name2, name3, name4, name5;
    
    public Constructorr()  //zero parameterized constructor
    {
    	System.out.println("Welcome to Velocity training Pvt Ltd");
    	
    	System.out.println("##########################################");
    	
    	//variable initialization
    	
    	Sub = "Automation / Java";
    	Sub1 = "Manual Testing";
    	Faculty = "Joshi Sir";
    	Faculty1 = "Jayesh Sir";
    	time = "6:30 to 7:30 PM";
    	time1 = "7:30 to 8:30 PM";
    	batch = "Velocity 9th April Evening Testing";
    	batch1 = "Velocity 9th April Evening Testing";
    	
    	// variable usage
    	System.out.println("Subject name :  "+Sub);
    	System.out.println("Faculty name :  "+Faculty);
    	System.out.println("Batch time   :  "+time);
    	System.out.println("Batch name   :  "+batch);
    	
    	System.out.println("-------------------------------------------");
    	
    	System.out.println("Subject name :  "+Sub1);
    	System.out.println("Faculty name :  "+Faculty1);
    	System.out.println("Batch time   :  "+time1);
    	System.out.println("Batch name   :  "+batch1);
    	
    	System.out.println("############################################");
    	
    	
     }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructorr c = new Constructorr();  //calling constructorr method 
		
		
		c.mockgroup();

	}
	
	public void mockgroup()
	{
		
		// variable initialization
		
		name = "Swati";
		name1 = "Shilpa";
		name2 = "Reema";
		name3 = "Swapnil";
		name4 = "Shrikant";
		name5 = "Pankaj";
		
		System.out.println("My Mock Group");
		
		System.out.println("___________________________________________");
		
		// variable usage/calling
		
		System.out.println("Team member 1  :  "+name);
		System.out.println("Team member 2  :  "+name1);
		System.out.println("Team member 3  :  "+name2);
		System.out.println("Team member 4  :  "+name3);
		System.out.println("Team member 5  :  "+name4);
		System.out.println("Team member 6  :  "+name5);
		
	}

}
