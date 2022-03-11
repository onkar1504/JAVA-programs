//In the below example, the class Employee has a constructor named Employee().It takes two argument,i.e., string s & int i. 
//The same constructor is overloaded and then it accepts three arguments i.e., string s, int i & int salary. 

class overloading
{
	//first constructor
	
	public overloading(String s , int i)
	{
		System.out.println("the name is:"+s);
		System.out.println("the id is :"+i);

		
	}
	
	
	//second constructor
	public overloading(String s , int i , int salary)
	{
		System.out.println("the name is :"+s);
		System.out.println("the id is :"+i);
		System.out.println("the salary is : "+salary);
	}
}

public class ConstructorOverloading
{

	public static void main(String[] args) 
	{
		overloading obj1 = new overloading("lonkar",1);  // first constructor 
		
		overloading obj2= new overloading("onkar",2,50000); //second constructor
		


	}

}
