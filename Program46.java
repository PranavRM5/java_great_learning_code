//Parent Class
public class Program46
{
	public static void main(String[] args) {
		Student s=new Student();
		s.showDetails();
	}
}
//Child Class
class Student{
	String name="Bob";
	int marks=10;
	public void showDetails()
	{
		System.out.println("Student Name "+name);
		System.out.println("Student Marks "+marks);
		
	}
}