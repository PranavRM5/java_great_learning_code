//Inheritance With Constructor

import java.util.Scanner;
public class Program50
{
	public static void main(String args[])
	{
	    Scanner in=new Scanner(System.in);		
	    System.out.println("Enter Cost Of Vehicle ");
	    int cost=in.nextInt();
	
		System.out.println("Enter Mileage Of Vehicle ");
		int mileage=in.nextInt();
		
		System.out.println("Enter Colour Of Car");
		String color=in.next();
		
		System.out.println("Enter Number Of Tyres In Car");
		int tyres=in.nextInt();
		
		car c=new car(cost, mileage, color, tyres);
		
		c.showVehicleDetails();
		c.showCarDetails();
	}
}
				
//Parent Class		
 class vehicle
{
	
	int cost=0;
	int mileage=0;
	
	public vehicle(int c, int m)
	{
		
		cost=c;
		mileage=m;
		
	}
	void showVehicleDetails()
	{
		System.out.println("Hello I Am Vehicle");
		
		System.out.println("Cost Of Vehicle "+cost);
		
		System.out.println("Mileage Of Vehicle "+mileage);
		
	}
}
//Child Class

 class car extends vehicle
{

	String color="   ";
	int tyres=0;
	
	public car(int c, int m, String col, int ty)
	{
		
		super(c,m);
		
		color=col;
		tyres=ty;
		
	}
	 void showCarDetails()
	{
		System.out.println("Hello I Am Car");
	
		System.out.println("Colour Of Car "+color);
		
		System.out.println("Number Of Tyres In Car "+tyres);
		
	}
}