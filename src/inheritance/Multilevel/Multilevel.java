package inheritance.Multilevel;

public class Multilevel {

	public static void main(String[] args) 
	{
	   Grandmother gm = new Grandmother();
	   gm.summer();
	   gm.rainy();
	   
	   
	   Mother mo = new Mother();
	   mo.pune();
	   mo.mumbai();
	   mo.rainy();
	   
	   Son so = new Son();
	   so.java();
	   so.c();
	   so.summer();
	   so.pune();
	   
	   so.mul();

	}

}


//This summer is very hot
//it rained a lot this time
//Pune is historical city
//Mumbai is hurt of maharashtra
//it rained a lot this time
//java is object oriented programming language
//C is genral purpose programming language
//This summer is very hot
//Pune is historical city