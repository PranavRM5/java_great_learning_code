//Use Final Keyword
import java.util.Scanner;
public class Program40
{
		public static void main(String args[])
		{
		Scanner ok=new Scanner(System.in);
		final double PI=3.14159;
		System.out.println("Radius of Circle ");         
		float r=ok.nextInt();
		double area=PI*r*r;
		System.out.println("Area of Circle "+area);
		}
}