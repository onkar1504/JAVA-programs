package ex;

public class test implements Runnable
{
	public void run()
	{
		System.out.println("hello");
		System.out.println("hello");
	}
	public static void main(String[] args)
	{
			test obj = new test();
			Thread thread = new Thread(obj);
			
			thread.start();
			System.out.println("world");
			try
			{
				thread.join();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("for ");
	}
}
