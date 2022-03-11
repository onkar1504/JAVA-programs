class phone
{
	 public void showTime()
	 {
	        System.out.println("Time is 8 am");
	 }
	
	public void on()
	{
		System.out.println("turning on phone.....");
	}
}

class smartphone extends phone
{
	public void music()
	{
        System.out.println("Playing music...");
    }
	
	@Override
	public void on()
	{
		System.out.println("turning on smartphone....");
	}
}

public class DynamicMethodDispatch
{

	public static void main(String[] args)
	{
//		phone obj = new  phone(); //allowed
		
//		smartphone smobj =new smartphone(); //allowed
		
		phone obj =  new smartphone(); // yes allowed
		
		obj.on();  //turning on smartphone
		
		obj.showTime();  //Time is 8 am
		
//		obj.music //not allowed   cause only call override methods in subclass
		
		
	
		
		
		
	}

}
