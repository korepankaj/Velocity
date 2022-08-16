package parameter;

public class Parameterwithnonstaticmethod {

	public static void main(String[] args) 
	{
		Parameterwithnonstaticmethod pgg = new Parameterwithnonstaticmethod();
		pgg.pg();
		
		//calling non static method with parameter  //variable initialization
		pgg.Ug("BCA","SRTMUN","COCSIT College",64.54f,2015,22);  
		
		ugpgfriends ugpg = new ugpgfriends();
		ugpg.ug();
		ugpg.pg("Vinayak","Pranav","Ranjit");
		
		

	}
	public void pg()
	{ 
		//Variable declaration
		
		String degreename;
        String universityname;
        String collegename;
        float percentage;
        int passoutyear;
        
        
        //variable initialization
        
        degreename = "MCA";
        universityname = "SPPU";
        collegename = "Sinhgad college";
        percentage = 60.58f;
        passoutyear = 2018;
        
        // variable usage
        
        System.out.println("My highest qualification is         :  "+degreename);
        System.out.println("University Name                     :  "+universityname);
        System.out.println("My PostGraduation college name is   :  "+collegename);
        System.out.println("PG Percentage                       :  "+percentage);
        System.out.println("PG Passout Year                     :  "+passoutyear);
        
        System.out.println("#########################################################");
        
      }
	                      //parameter   //variable declaration
	  public void Ug(String degreename, String Universityname, String collegename, float percentage, int passoutyear, int Rollno)
	  {
		  // variable usage
	        
	    System.out.println("My highest qualification is         :  "+degreename);
	    System.out.println("University Name                     :  "+Universityname);
	    System.out.println("My PostGraduation college name is   :  "+collegename);
	    System.out.println("PG Percentage                       :  "+percentage);
	    System.out.println("PG Passout Year                     :  "+passoutyear);
	    System.out.println("My Rollno is                        :  "+Rollno);
		  
	    System.out.println("########################################################");
	  }
  }
	  class ugpgfriends
	  {
		  public void ug()
		  {
			  
			  // Variable declaration 
			  
			  String name;
			  String name1;
			  String name2;
			  
			  //variable initialization
			  
			  name =  "Balaji";
			  name1 = "Abhijeet";
			  name2 = "Amol";
			  
			  // variable usage
			  
			  System.out.println("Name  :"+name);
			  System.out.println("Name  :"+name1);
			  System.out.println("Name  :"+name2);
			  
			  System.out.println("###########################################################");
              			  
		  }
		  
		  public void pg(String name, String name1, String name2)
		  {
			  
              // variable usage
			  
			  System.out.println("Name  :"+name);
			  System.out.println("Name  :"+name1);
			  System.out.println("Name  :"+name2);
			  
			  System.out.println("###########################################################");
		  }
	  }


