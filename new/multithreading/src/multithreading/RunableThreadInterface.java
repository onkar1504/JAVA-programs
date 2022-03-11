package multithreading;

class Hii implements Runnable
{

	@Override
	public void run()
	{
		System.out.print("\n hii");
		
	}

}

public class  RunableThreadInterface 
{

	public static void main(String[] args) 
	{
		Runnable obj =new Hii();
		
		Thread thread =new Thread (obj);
		
		thread.start();
		
		

//		System.out.print("outside the thread");
		
	}


}
