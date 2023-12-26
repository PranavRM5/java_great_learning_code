//Abstract class in Java
public class Program52
{
	public static void main(String[] args) 
	{
		cat c=new cat();
		dog d=new dog();
		
		c.animalSound();
		d.animalSound();
	}
}

abstract class animal 
{
	public abstract void animalSound();
}

 class cat extends animal
{
	public void animalSound()
	{
		System.out.println("Meow");
	}
}

 class dog extends animal
{
	public void animalSound()
	{
		System.out.println("Bow, Bow");
	}
}