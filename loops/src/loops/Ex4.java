// Writing a program that reads a positive number N from the user then indicates if N is prime or not.
package loops;

import java.util.Scanner;

public class Ex4 
{

	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		System.out.println( "enter a number");
		int n = s.nextInt();
		
		boolean isprime= true;
		
		
		for(int i=2; i<=n/2;i++)
		{
			if(n %i ==0)
			{
				isprime=false;
				break;
			}
			
				
		}
		System.out.println(isprime ?"its prime":"not prime");
		
		

	}

}
