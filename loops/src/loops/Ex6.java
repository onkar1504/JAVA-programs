//Q .write a program which displays the sum of digits of an integer read from user
// ex: 108 -> 1+0+8=9

package loops;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		 
		int sum =0;
		
		while(n > 0)
		{
			sum +=n %10;  //ABC
			n/=10;         //AB
		}

		System.out.println("sum is:"+sum);
	}

}
