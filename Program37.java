public class Program37 
{
public static void main(String args[])
{
	int [] a=new int[5];
	int [] b=new int[5];
	int [] c=new int[5];
	int num=5, i;
	
	for(i=0;i<5;i++)
	{
		a[i]=i;
	}
	for(i=0;i<5;i++)
	{
		b[i]=num;
		num++;
	}
	System.out.println("Values in Array A");
	for(i=0;i<5;i++)
	{
		System.out.print(a[i]+" ");
	}
	System.out.println();
	System.out.println("Values in Array B");
	for(i=0;i<5;i++)
	{
		System.out.print(b[i]+" ");
	}
	System.out.println();
	for(i=0;i<5;i++)
	{
		c[i]=a[i]+b[i];
	}
	System.out.println("Values in Array C");
	for(i=0;i<5;i++)
	{
		System.out.print(c[i]+" ");
	}
}
}