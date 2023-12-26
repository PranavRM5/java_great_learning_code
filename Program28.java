public class Program28
{
	public static void main(String args[])
	{
		Program28 obj=new Program28();
		int x=20;
		int y=30;
		
	int getResult=obj.add(x,y);
	System.out.println(getResult);
	}
	public int add(int a, int b)
	{
          int result=a+b;
          return result;
	}
}