//Object Properties And Behaviour
class Student
{
	int rollNo=10;
	String studentName;
	public void studentName()
	{
	     System.out.println("Behaviour is good");
	}
	public void examMarks()
	{
		
	}
}


public class Program67
{
	public static void main(String args[])
	{
		Student s= new Student();
		System.out.println(s.rollNo);
		System.out.println(s.studentName);
		
	}
}