

class Ekclass
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
	 
	Ekclass(int v)  //constructor
	{
		this.a= v;	
	}
	public int returnone()
	{   
		return 1;
			
	}
}
public class This

{

	public static void main(String[] args)
	{
		Ekclass  e = new Ekclass(3);
		System.out.println(e.a);
//		System.out.println(e.getA());
	}

}
