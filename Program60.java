//ArrayList in Java
import java.util.ArrayList;
//import java.util.Scanner;
public class Program60
{
	public static void main(String args[])
	{
		ArrayList<String> car=new ArrayList<String>();
		car.add("1");
	    car.add("2");
	    car.add("3");
	    car.add("4");
	    System.out.println("Before Using set Operation");
		System.out.println(car);
		car.set(0,"5");
		System.out.println("After Using set Operation");
	    System.out.println(car);
	}
}