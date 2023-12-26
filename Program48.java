//Class With Constructor
//Parent Class
import java.util.Scanner;
public class Program48  
{
	public static void main(String[] args) 
	{
		
	Scanner input=new Scanner(System.in);
    
    System.out.println("Enter Your Name");
	String StudentName=input.nextLine();
    
    System.out.println("Enter Your Mark");
	int StudentMarks=input.nextInt();
	
	Student s=new Student(StudentName, StudentMarks);		
	
	s.showDetails();
	}
}
//Child Class

class Student{

	String name=" ";
	int marks=0;
	
    public Student(String s, int m)
	{
		name=s;
		marks=m;
	}
	public void showDetails()
	{
		System.out.println("Student Name :-"+name);
		
		System.out.println("Student Marks:-"+marks);
		
	}
}