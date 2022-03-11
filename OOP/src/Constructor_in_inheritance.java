class base1
{
	base1()  //constructor
	{
		System.out.println("i am base constructor");
	}
	
	base1(int a) //parameterze constructor
	{
		System.out.println("i am overloaded base constructor wtith value a: "+ a);
	}
}

class derived1 extends base1
{
	derived1() //constructor
	{
//		super(1); // calling base1 parameterize constructor
		System.out.println("i am derived constructor");
	}
	
	derived1(int x ,int y)
	{
		super();
		System.out.println("i am overloaded constructor of derived wtith value x: "+ x);
		System.out.println("i am overloaded constructor of derived wtith value y: "+ y);
	}
}

class childofderived extends derived1
{
	childofderived()
	{
		System.out.println("iam a childofderived constructor");
		
	}
	
	childofderived(int x , int y ,int z)
	{
		super(x,y);
		System.out.println("i am overloaded constructor of child of derived wtith value z: "+ z);
	}
}

public class Constructor_in_inheritance 
{

	public static void main(String[] args) 
	{
//		base1 b = new base1();
//		derived1 d =new derived1();
		
		childofderived cd =new childofderived(11,11,11);		

	}

}
