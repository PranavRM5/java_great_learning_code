public class Program31
{
	public static void main(String args[])
	{
		int a=10, b=15, c=2;
		
		rarea(a,b);
		carea(c);
	}
	public static void rarea(int x, int y)
    {
    	System.out.println("area of reactangle="+x*y);
    }
    public static void carea(int z)
    {
    	System.out.println("area of circle="+3.14f*z*z);
    }
}