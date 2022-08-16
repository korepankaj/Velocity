package access_modifier_public_protected;

import access_modifier.Access_modifier;

public class Calling_Public_Method
{
   public static void main(String[] args) 
   {
		Access_modifier am = new Access_modifier();
		am.mul();  //calling public method from different package within project
		
   }
   
}