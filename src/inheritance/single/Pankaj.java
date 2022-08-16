package inheritance.single;

class Pankaj extends Student
{
	void ouput()
	{
		//System.out.println(rollno+" "+name+" "+marks);
		
		//System.out.println("Student Roll No : "+rollno+" Student name : "+name+" Subject marks : "+marks);
	
		System.out.println("Student Roll no : "+rollno);
		System.out.println("Student name : "+name);
		System.out.println("Subject mark : "+marks); 
	}
	
	public static void main(String[] args)
	{
		Pankaj p = new Pankaj();
		p.input();
		Student.io();
		p.ouput();
		
	
				
		
	    
		
	}
	
}
