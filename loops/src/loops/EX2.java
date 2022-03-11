//Q:Writing a program that reads a sequence of integers from the user and stops by displaying “Done” when the sum of these values exceeds 100.

package loops;

import java.util.Scanner;

public class EX2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int sum=0;
		
		while(true)
		{
			System.out.print("enter a number:");
			sum += s.nextInt();
			
			
			
			if(sum >=100)
				break;
		}
		
		System.out.println("done"+sum);
		

	}

}
