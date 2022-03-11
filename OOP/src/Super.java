//The super keyword in Java is used in subclasses to access superclass members
//(attributes, constructors and methods).


class firstclass
{
	public int getA() 
	{
		return a;
	}
	
	public void setA(int a)
	{
		this.a = a;
	}
	int a;
	 
	firstclass(int v)  //constructor
	{
		this.a= v;	
	}
	public int returnone()
	{   
		return 1;
			
	}
}

class secondclass extends firstclass
{
	secondclass(int c)
	{
		super(c);
		System.out.println("i am constructor");	
	}

}
public class Super 
{

	public static void main(String[] args) 
	{
		Ekclass  e = new Ekclass(33);
	
		secondclass s =new secondclass(5);
		
		System.out.println(e.getA());
	}

}
