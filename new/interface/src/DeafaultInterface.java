//abstract class- defined method and declared methods
//interface- only declare


interface Demo
{
	void getarea();               //declared
	
	default void show()
	{
		System.out.print("i will");
	}
}

class DemoImp implements Demo
{

	@Override
	public void getarea() 			//define
	{
		int l=6;
		int b=6;
		int area=l*b;
		System.out.println(" \n area of rectangle is : 	"  + area);
	}
	
}
public class DeafaultInterface
{

	public static void main(String[] args) 
	{
		Demo obj=new DemoImp();
		
		obj.show();
		obj.getarea();
	

	}

}
