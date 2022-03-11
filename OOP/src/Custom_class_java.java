class Employee1
{ 
	//attribute
	int id;
	String name;
	int salary;
	
	public void printdetails()
	{
		System.out.println("my id is"+id);
		System.out.println("my name is"+name);
	}
	
	public int getsalary()
	{
		return salary;
	}
}

 
public class Custom_class_java
{

	public static void main(String[] args) 
	{
		System.out.println("this is our custom class");
		
		Employee1 emp = new Employee1(); // insistiating a new employee object
		
		System.out.println("*****first object detais****");
		//setting attribute for lonkar
		emp.id=15;
		emp.name="lonkar";
		emp.salary=34000;
		
	
		
		System.out.println("*****second object detais****");
		//setting attribute for onkar
		Employee1 emp2= new Employee1();
		emp2.id=16;
		emp2.name="onkar";
		emp2.salary=40000;
		
		//printing the attributes 
//		System.out.println(emp.id);
//		System.out.println(emp.name);
		
		emp.printdetails();
		emp2.printdetails();  
		
		int salary = emp2.getsalary();
		System.out.println(salary);
	}

}
