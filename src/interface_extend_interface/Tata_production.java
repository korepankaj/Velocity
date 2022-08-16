package interface_extend_interface;

//this class implements sub interface TataLW
//as Tatamotor is sub interface, that its own property and properties from Tata
//Tata_production has to give definition to all incomplete methods

public class Tata_production implements Tatamotor 
{
  
   @Override
   public void truck() 
   {
	    System.out.println("This is super interface truck");
   }

   @Override
   public void bus() 
   {
	    System.out.println("This is superinterface bus");
   }

   @Override
   public void car() 
   {
        System.out.println("This is sub interface car ");
   }

   @Override
   public void minibus() 
   {
	    System.out.println("This is sub interface minibus");
   }

  public static void main(String[] args) 
  {
	 Tata_production tata = new Tata_production();
	 tata.truck();
	 tata.bus();
	 tata.car();
	 tata.minibus();
  }


}
