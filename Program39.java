import java.util.Scanner;
public class Program39
{
	String str="Hello";
	Integer strLength=5;

		public void displayString()
		{
		Scanner Ok=new Scanner(System.in);
		System.out.println("1. String length "+str.length() );
		System.out.println();
		System.out.println("2. Index 2 character "+str.charAt(2) );
		System.out.println();
		System.out.println("3. concatenate string " +str.concat(" World"));
		System.out.println();
		System.out.println("4. String Comparison is " +str.compareTo("World"));        System.out.println();
		System.out.println("5. index of H is "+str.indexOf("H") );
		System.out.println();
		System.out.println("6. last index of l is " +str.lastIndexOf("l") );
		System.out.println();
		System.out.println("7. Replace string is "  +str.replace('e', 'a'));
		System.out.println();
		System.out.println("8. substring is "+str.substring(2,5) );
		System.out.println();
		System.out.println("9. integer to string is  " +strLength.toString() );
		System.out.println();
		String str1=" Hello ";
		
		System.out.println("10. untrimmed string is "+str1);
		System.out.println();
		System.out.println("11. trimmed string is " +str1.trim() );
		System.out.println();
		}
			public static void main(String args[])
	{
		Program39 objString=new Program39();
		objString.displayString();
		
	}
}
//String Method