import java.util.Scanner;

public class nestedifelse {

	public static void main(String[] args) 
	{
		System.out.println("enter the num:");
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		
		if(n >10)
		{
			System.out.println("number greater than 10");
		}
		
		else if(n==10)
		{
			System.out.println("number equal 10");
		}
		else
		{
			System.out.println("less than 10");
		}
	}

}
