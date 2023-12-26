public class Program30
{
	public static void main(String args[])
	{
		int a=10, b=15;
		
		swap(a,b);
	}
	public static void swap(int x, int y)
	{
		System.out.println("before swap a="+x+" b="+y);
		int w=x;
		x=y;
		y=w;
		System.out.println("After swap a="+x+" b="+y);
		
	}
}