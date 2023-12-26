//Taking Input From User In Class
//Parent Class
import java.util.Scanner;
public class Program47
 
{
	public static void main(String[] args) {
		Student s=new Student();
		s.getDetails();
		s.showDetails();
	}
}
//Child Class

class Student{
	Scanner input=new Scanner(System.in);
	String name=" ";
	int marks=0;
	public void getDetails()
	{
		System.out.println("Enter Your Name");
		name=input.nextLine();
		System.out.println("Enter Your Marks");
	    marks=input.nextInt();
	}
	public void showDetails()
	{
		System.out.println("Student Name :-"+name);
		System.out.println("Student Marks:-"+marks);
		
	}
}
