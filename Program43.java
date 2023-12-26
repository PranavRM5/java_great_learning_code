import java.util.Scanner;
public class Program43
{
	enum ok{
		East, West, North, South;
	}

public static void main(String args[])
{
	ok i1;  
	i1=ok.East;
	System.out.println("Enum is "+i1);
	ok i2;  
	i2=ok.West;
	System.out.println("Enum is "+i2);
}
}