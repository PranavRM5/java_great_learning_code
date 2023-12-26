//LinkedList in Java
import java.util.Scanner;
import java.util.LinkedList;
public class Program66
{
	public static void main(String args[])
	{
		LinkedList<String> name=new LinkedList<String>();
		name.add("Ram");
		name.add("Shyam");
		name.add("Om");
		name.add("Shriram");
		System.out.println();
		System.out.println("Before Using Removing at First & Last Operation");
		System.out.println(name);	
		System.out.println();
		System.out.println("After Using Removing at First & Last Operation");
		name.removeFirst();
		name.removeLast();
	    System.out.println(name);
	}
}