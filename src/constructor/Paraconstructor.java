package constructor;

public class Paraconstructor 
{
	
	// Global variable for constructor
	
	String name,company,dept;
	int empid, sal, Bon;
	int Pincode;
	String Area, City, State,DOB;
	
	public Paraconstructor(String N, String C, int I, String D, int S, int B)  //user defined parameterized constructor
	{
		name = N;
		company = C;
		empid = I;
		dept = D;
		sal = S;
		Bon = B;
	}
	public void company()  //Non static method
	{
	   System.out.println("--------------------------------------");
		
	   System.out.println("Name of employee        :  "+name);  //calling non static global variable from same class
	   System.out.println("Company name            :  "+company); //calling non static global variable from same class
	   System.out.println("EmpId                   :  "+empid); //calling non static global variable from same class
	   System.out.println("Employee Department No  :  "+dept); //calling non static global variable from same class
	   System.out.println("Employee Monthly salary :  "+sal);  //calling non static global variable from same class
	   System.out.println("Company bonus           :  "+Bon);  //calling non static global variable from same class
	}
	public static void main(String[] args) 
	{
		
		System.out.println("Employee detail information");
		
		
		Paraconstructor pc = new Paraconstructor("Balaji kasmale", "Mphasis", 211255, "Application support", 30000, 5000);  //created object. user defined constructor
		Paraconstructor pg = new Paraconstructor("26/04/1994/",411041, "Vadgaon Budruk", "Pune", "Maharashtra");   //created object. user defined constructor
        pc.company();
        pg.empperdetail();
        
        Paraconstructor pa = new Paraconstructor("Abhijeet Nillapalle", "Swiggy", 211244, "Food delivery support", 25000, 5000);  //created object. user defined constructor
        Paraconstructor pb = new Paraconstructor("5/04/1995", 411041, "Vadgaon budruk", "Pune", "Maharashtra");  //created object. user defined constructor
        pa.company();
        pb.empperdetail();
        
        Paraconstructor pk = new Paraconstructor("Pankaj kore", "VDA Infosolution", 142425, "FMS Support", 10000, 00000);  //created object. user defined constructor
        Paraconstructor po = new Paraconstructor("22/12/1992", 411040, "Wanwadi", "Pune", "Maharashtra");  //created object. user defined constructor
        pk.company();
        po.empperdetail();
        		
     }
	
	public Paraconstructor(String a, int b, String c, String d, String e) //user defined Parameterized constructor
	{
		DOB = a;
		Pincode = b;
		Area = c;
		City = d;
		State = e;
		
	}
	
	public void empperdetail() 
	{
		System.out.println("Employee Date of birth  :  "+DOB);
		System.out.println("Employee area pincode   :  "+Pincode);
		System.out.println("Employee Area           :  "+Area);
		System.out.println("Employee City           :  "+City);
		System.out.println("Employee State          :  "+State);
	}

}
