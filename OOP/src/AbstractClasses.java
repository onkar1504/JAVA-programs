abstract class Parent
{
	public Parent(	)
	{
		System.out.println("inside base constructor");
	}
	
	public void sayhello()
	{
		System.out.println("hello");
	}
	
	abstract public void greet();
	abstract public void greet2();
		
}

class child extends Parent
{

	@Override
	public void greet()
	{
		System.out.println("good morning");
	}
	
	@Override
	public void greet2()
	{
		System.out.println("good morning");
	}
	
}

abstract class grandchild extends Parent
{
	public void xyz()
	{
		System.out.println("i am good");
	}
	
}

public class AbstractClasses 
{

	public static void main(String[] args) 
	{
//		Parent obj = new Parent();   error yenar bcaz class is abstract
		
		child obj = new child();
		
//		grandchild obj1 = new grandchild();  error yenar bcaz class is abstract
		
	}

}
