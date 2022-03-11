class Base     //superclass
{
	int x;

	public int getX() 
	{
		return x;
	}

	public void setX(int x) 
	{
		System.out.println("i am base and setting x now");
		this.x = x;
	}
}

class derived extends Base    //subclass
{
	int y;

	public int getY() 
	{
		return y;
	}

	public void setY(int Y) 
	{
		System.out.println("i am derived setting y now");
		this.y = Y;
	}
	

}

public class Inheritance 
{

	public static void main(String[] args) 
	{
		//creating obj of base class
		Base b = new Base();
		b.setX(4);
		System.out.println(b.getX());
		
		//creating obj of derived class
		derived d =new derived();
		d.setY(2);
		System.out.println(d.getY());

	}

}
