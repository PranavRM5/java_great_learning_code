//Extend and Implement
import java.util.Scanner;
public class Program54
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter Your Name");
		String personName=in.nextLine();
		System.out.println("Enter Your Age");
		int personAge=in.nextInt();
		System.out.println("Enter Your Salary");
        int personSalary=in.nextInt();
        
        man m=new man(personName, personAge, personSalary);
        
        m.ShowPersonDetails();
        m.task();
	}
}
        
//Person Class
class person
{
	String name=" ";
	int age=0;
	
	public person(String n, int a)
	{
		name=n;
		age=a;
	}
	public void ShowPersonDetails()
	{
		System.out.println("Name is "+name);
		System.out.println("Age is "+age);
	}
}
//Implement Class
interface father
{
	public void task();
}
//Child Class
class man extends person implements father
{
	int salary = 0;
		
public man(String n, int a, int s)
{
	super(n, a);
	salary=s;
}
		
public void task()
{
	System.out.println("Earn Money");
	System.out.println("Salary is "+salary);
	}
}