//ArrayList in Java
import java.util.ArrayList;
//import java.util.Scanner;
public class Program62
{
	public static void main(String args[])
	{
		ArrayList<String> car=new ArrayList<String>();
		car.add("1");
	    car.add("2");
	    car.add("3");
	    car.add("4");
	    System.out.println("Before Using remove Operation");
		System.out.println(car);
		System.out.println("After Using remove Operation");
		car.remove(0);
	    System.out.println(car);
	}
}