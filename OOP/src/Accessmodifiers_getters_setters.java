

class myemployee
{
	private int id;
	private  String name;
	
	// getter method
	public String getname()
	{
		return name;
	}
	
	// setter method
	public void setname(String n)
	{
		name =n;
	}
	
	public void setid(int i)
	{
		id=i;
	}
	public int getid()
	{
		 return id;
		 
	}
}

public class Accessmodifiers_getters_setters 
{

	public static void main(String[] args)
	{
		myemployee	emp = new myemployee();
//		emp.id=11;
//		emp.name="onkar"; --. throw error due to private access modifier
		
		
		// access the private variable using the getter and setter
		emp.setname("onkar");
		System.out.println(emp.getname());
		
		emp.setid(15);
		System.out.println(emp.getid());
		
	}

}
