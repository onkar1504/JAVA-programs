// Writing a program that prints the prime numbers between two numbers. This program is divided
public class Ex2 {

	public static void main(String[] args) 
	{
		System.out.println(isprime(3));
		primebetween(10,30);
	}
	
	public static boolean isprime(int n)
	{
		for(int i=2;i<=n/2;i++)
			return false;
		return true;
	}
	//2nd method its also be used to print prime no
	public static void primebetween(int start, int end)
	{
		for(int i=start ;i<=end;i++)
			if(isprime(i))
				System.out.print(i+" ");
	}

}
