
class mymainemployee
{
	private int id;
	private  String name;
	
	//creting constructor
	
	public mymainemployee()
	{
		id=15;
		name="lonkarrr";
		
	}
	//creting constructor parameterize
	
	public mymainemployee(String myname , int myid)
	{
		name= myname;
		id = myid; 
	}
	
	
	// getter method
	public String getname(){
		return name;
	}
	
	// setter method
	public void setname(String n){
		name =n;
	}
	
	public void setid(int i){
		id=i;
	}
	public int getid(){
		 return id;
	}
}

public class Constructor {

	public static void main(String[] args) 
	{
		mymainemployee emp = new mymainemployee(  );
//		emp.setname("onkar lonkar");
//		emp.setid(15);
		
		
		System.out.println(emp.getid());
		System.out.println(emp.getname ());
		

	}

}
