//interface in java

public class Program53
{
	public static void main(String args[])
	{
		iphone ip=new iphone();
		
		ip.cost();
		ip.color();
		ip.batteryLife();
		
	}
}

//interface class
interface phone
{
		public void cost();
		public void color();
		public void batteryLife();
}	
//Child Class
class iphone implements phone
{
	public void cost()
	{
	System.out.println("Cost of Iphone is 10$");
	}
	public void color()
	{
	System.out.println("Color of Iphone is Silver");
	}
	public void batteryLife()
	{
	System.out.println("Battery Life of Iphone is 10 hour");
     }
}