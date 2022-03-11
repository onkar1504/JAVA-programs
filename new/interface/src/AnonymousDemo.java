class A
{
	public void show()
	{
		System.out.print("in A");
	}
}

public class AnonymousDemo 
{

	public static void main(String[] args)
	{
		A obj=new A()
				{
			
					public void show()
					{
						System.out.print("I AM THE  BEST");
					}
			
				};                           //anonymous class
				
		obj.show(); 
		 
	}

}


