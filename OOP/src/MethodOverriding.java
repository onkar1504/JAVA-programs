class A
{
	public int a;
	
	public int onkar()
	{
		return 4;
	}
	
	public void method2()
	{
		System.out.println("i am method2 of class A ");
	}
	
	
	protected void method3()   // protected  access honar jar private asal tar nahi
	{
		System.out.println("i am method3 of class A");
	}
}

class B extends  A
{	
	@Override
	public void method2()
	{
		System.out.println("i am method2 of class B ");
	}
	
	@Override
	public void method3()
	{
		super.method3();
		
		System.out.println("i am method3 of class B");
	}
	

}
public class MethodOverriding 
{
		public static void main(String[] args) 
	{
		A a = new A();
		a.method2();
		
		B b = new B();
		b.method2();
		
		b.method3();
	}

}
