public class Program36 
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
	for(i=0;i<5;i++)
	{
		System.out.print(a[i]+" ");
	}
	System.out.println();
	for(i=0;i<5;i++)
	{
		System.out.print(b[i]+" ");
	}
	System.out.println();
	for(i=0;i<5;i++)
	{
		c[i]=a[i]+b[i];
	}
	for(i=0;i<5;i++)
	{
		System.out.print(c[i]+" ");
	}
}
}