package loops;

import java.util.Scanner;

public class Break_continue
{

	public static void main(String[] args) 
	{
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			continue;
			
			System.out.println(i+" odd number");
		}
		
		Scanner s =new Scanner(System.in);
		
		int n ;
		while(true)
		{
			
			System.out.print("enter num bw 1 to 10");
			n = s.nextInt();
			
			if(n<1 || n>10)
				continue;
			
			System.out.println(n+" is bw 1 to 10");
			break;
		}
	}

}
