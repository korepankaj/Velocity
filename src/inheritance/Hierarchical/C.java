package inheritance.Hierarchical;

public class C extends A
{
  private void display()
  {
	  System.out.println("This is private method");
  }
  
  public static void main(String[] args)
  {
	  B b = new B();
	  b.show();
	  b.Input();
	  
	  C c = new C();
	  c.mob();
	  c.display();
	  
	
   	  
  }
}
