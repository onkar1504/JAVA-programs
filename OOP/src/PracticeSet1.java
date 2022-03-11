//Question1. Create a class Employee with the following properties and methods:
			//Salary (property) (int)
			//getSalary (method returning int)
			//name (property) (String)
			//getName (method returning String)
			//setName (method changing name)

class Employee
{
    int salary;
    String name;

    public int getSalary()
    {
        return salary;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }
}


public class PracticeSet1 {

	public static void main(String[] args) 
	{
		Employee emp =new Employee();
		emp.setName("onkar");
		emp.salary=15000;
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());

	}

}
