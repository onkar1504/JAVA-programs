interface Abc
{
	void show();          //declared here
}



public class AnonymousInterface 
{

	public static void main(String[] args) 
	{
		Abc obj=new Abc()
				{
					public void show()
					{
						System.out.print("i can i will");
					}
			
				};

		obj.show();
	}

}
