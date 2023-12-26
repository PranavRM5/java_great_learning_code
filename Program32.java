public class Program32
{
	public static void main(String args[])
	{
		int a=10, b=15;
		float c=2;
		
		int rectangleArea=area(a,b);
		float circleArea=area(c);
		
		System.out.println("Area of rectangle="+rectangleArea);
		System.out.println("Area of circle="+circleArea);
		
	}
	public static int area(int x, int y)
    {
    	int result=x*y;
    	return result;
    }
    public static float area(float z)
    {
    	float result=3.14f*z*z;
    	return result;
    }
}