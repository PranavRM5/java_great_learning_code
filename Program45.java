public class Program45
{
	enum Direction{
		East, West, North, South;
	}
	public static void main(String args[])
	{
		Direction direction1;
		Direction direction2;
		
		direction1=Direction.East;
		direction2=Direction.West;
		
		System.out.println("Enum 1 is "+direction1);
		System.out.println("Enum 2 is "+direction2);
	}
}