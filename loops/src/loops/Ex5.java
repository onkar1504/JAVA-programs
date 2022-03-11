// Q. Writing a program that reads a sequence of positive integers. 
//The program stops when the user fills a negative value and shows the maximum and the minimum of these numbers. 
//example :  6,0 ,5,7 ,-1 : max=7 , min=0

package loops;

import java.util.Scanner;

public class Ex5 
{

	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		
		int n=s.nextInt();
		
		int max=n;
		int min=n;
		
		if(n>=0)
		{
			while(true)
			{
				n=s.nextInt();
				
				if(n<0)
					break;
				
				if(n >max)
					max=n;
				
				if(n<min)
					min=n;
			}
				System.out.println("min ="+min +"max ="+max);
		}
		
		else
			System.out.println(n+"is invalid");
	}

}
