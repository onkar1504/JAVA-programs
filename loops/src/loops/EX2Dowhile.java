package loops;

import java.util.Scanner;

public class EX2Dowhile {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		int n;
		
		do {
			System.out.println("enter no between 1 to 10:");
			n=s.nextInt();
				
			
		}while(n < 1 || n>10);
		
		System.out.println(n+": is  between 1 to 10 : thanks");

	}

}
