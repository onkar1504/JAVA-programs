// Q. enter no between 1 to 10 using while loop

package loops;

import java.util.Scanner;

public class EX1Whileloop {

	public static void main(String[] args) 
	{
			Scanner s = new Scanner(System.in);
			System.out.println("enter a number between 1 to 10:");
			int n = s.nextInt();
		
			
			while (n < 1 || n> 10)
			{
				System.out.println(n+": is not between 1 to 10 : try again");
				
				n= s.nextInt();
				
			}
			System.out.println(n+": is  between 1 to 10 : thanks");
	}

}
