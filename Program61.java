//ArrayList in Java
import java.util.ArrayList;
//import java.util.Scanner;
public class Program61
{
	public static void main(String args[])
	{
		ArrayList<String> car=new ArrayList<String>();
		car.add("1");
	    car.add("2");
	    car.add("3");
	    car.add("4");
	    System.out.println("Before Using get Operation");
		System.out.println(car);
		System.out.println("After Using get Operation");
	    System.out.println(car.get(3));
	}
}