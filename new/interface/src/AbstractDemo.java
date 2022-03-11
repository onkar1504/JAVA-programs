abstract class Animal
{
	abstract void makesound();
	
	public void eat()
	{
		System.out.print("\n eat");
	}
}

class Dog extends Animal
{
	public void makesound()
	{
		
		System.out.print("\n they bark");
	}
		
}

class Cat extends Animal
{
	public void makesound()
	{
		System.out.print(" \n meow");
	}
}
class AbstractDemo 
{

	public static void main(String[] args) 
	{
		Dog d=new Dog();
		d.makesound();
		d.eat();
		
		Cat c=new Cat();
		c.makesound();
	}
	
}