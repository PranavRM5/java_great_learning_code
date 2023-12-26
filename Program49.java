//Example of Inheritance

import java.util.Scanner;
public class Program49
{
	public static void main(String args[])
	{
	    //Scanner in=new Scanner(System.in);		System.out.println("");
		car c=new car();
		c.showVehicleDetails();
	}
}
				
//Parent Class		
 class vehicle
{
	int cost=200;
	int mileage=35;
	
	public void showVehicleDetails()
	{
		System.out.println("Hello I Am Vehicle");
		System.out.println("Cost Of Vehicle "+cost);
		System.out.println("Hello I Am Vehicle "+mileage);
	}
}
//Child Class

 class car extends vehicle
{
	String color="Blue";
	int tyres=4;
	
	public void showCarDetails()
	{
		System.out.println("Hello I Am Car");
		System.out.println("Colour Of Car"+color);
		System.out.println("Number Of Tyres In Car"+tyres);
	}
}