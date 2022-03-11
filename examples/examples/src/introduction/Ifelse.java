//even or odd

package introduction;

import java.util.Scanner;

public class Ifelse 
{

	public static void main(String[] args) 
	
	{
		Scanner reader = new Scanner (System.in);
		System.out.println("enetr the number:");
		
		int num = reader.nextInt();
		
		// 1 method
		if(num%2==0) 
			System.out.println("its even num");
		else 
			System.out.println("its not even num");
		
		//2nd method
		
		Scanner reader1 = new Scanner (System.in);
		
		System.out.println("enetr the new  number:");
		
		int newnum= reader1.nextInt();
		
		String result= (newnum%2==0)?"even":"odd";
		
		System.out.println(result);
		
	}

}
