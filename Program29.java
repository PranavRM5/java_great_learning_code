public class Program29
{
	public static void main(String args[])
	{
		int a=10, b=15;
		
		swap(a,b);
	}
	public static void swap(int x, int y)
	{
		int w=x;
		x=y;
		y=w;
		
		System.out.println("a="+x);
		System.out.println("b="+y);
	}
}