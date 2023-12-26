//Multi Level Inheritance in Java
import java.util.Scanner;
public class Program51
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
        System.out.println("Enter Your Name");
        String personName=in.nextLine();
        System.out.println("Enter Your Age");
        int personAge=in.nextInt();
        System.out.println("Enter Your Gender");
        String personGender=in.next();
        
        Grandchild gc=new Grandchild(personName, personAge, personGender);
        gc.ShowParentDetails();
        gc.ShowChildDetails();
        gc.ShowGrandchildDetails();
	}
}
         
 //Parent Class																
 class Parent
{
	String name=" ";
	
	public Parent(String s)
	{
		name=s;
	}
	public void ShowParentDetails()
	{
		System.out.println("Name is "+name);
	}
}
//Child Class
class Child extends Parent
{
	int age=0;
	
	public Child(String s, int a)
	{
    	super(s);
	    age=a;
	}
	public void ShowChildDetails()
	{
		System.out.println("Age is "+age);
	}
}
//Grandchild Class
  class Grandchild extends Child
{
	String gender=" ";
	
	public Grandchild(String s, int a, String g)
	{
		super(s, a);
		gender=g;
	}
	public void ShowGrandchildDetails()
	{
		System.out.println("Gender is "+gender);
	}
}